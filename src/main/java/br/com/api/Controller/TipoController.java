package br.com.api.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.Model.Tipo;
import br.com.api.Repository.TipoRespositoryInterface;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST - Tipo")
public class TipoController {

	@Autowired
	TipoRespositoryInterface tipoRespository;

	@ApiOperation(value = "Retorna uma lista de tipo")
	@GetMapping("/listar/tipos")
	public List<Tipo> listarTipo() {
		return tipoRespository.findAll();
	}

	@ApiOperation(value = "Retorna uma unico tipo")
	@GetMapping("/buscar/tipo/{id}")
	public Tipo buscarTipo(@PathVariable(value = "id") long id) {
		return tipoRespository.findById(id);
	}

	@ApiOperation(value = "Salva um tipo")
	@PostMapping("/salvar/tipo")
	public Tipo salvarTipo(@RequestBody @Valid Tipo tipo) {
		return tipoRespository.save(tipo);
	}

	@ApiOperation(value = "Remover um tipo")
	@DeleteMapping("/remover/tipo")
	public void removerTipo(@RequestBody @Valid Tipo tipo) {
		tipoRespository.delete(tipo);
	}

	@ApiOperation(value = "Atualiza um tipo")
	@PutMapping("/editar/tipo")
	public Tipo atualizarTipo(@RequestBody @Valid Tipo tipo) {
		return tipoRespository.save(tipo);
	}
}
