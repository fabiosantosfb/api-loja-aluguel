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

import br.com.api.Model.Aluguel;
import br.com.api.Repository.AluguelRespositoryInterface;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST - Alugueis")
public class AluguelController {

	@Autowired
	AluguelRespositoryInterface alugarRepository;

	@ApiOperation(value = "Retorna uma lista de alugueis")
	@GetMapping("/listar/alugueis")
	public List<Aluguel> listarAlugueis() {
		return alugarRepository.findAll();
	}

	@ApiOperation(value = "Retorna um unico aluguel")
	@GetMapping("/buscar/aluguel/{id}")
	public Aluguel buscarAluguel(@PathVariable(value = "id") long id) {
		return alugarRepository.findById(id);
	}

	@ApiOperation(value = "Salva um aluguel")
	@PostMapping("/salvar/aluguel")
	public Aluguel salvarAluguel(@RequestBody @Valid Aluguel item) {
		return alugarRepository.save(item);
	}

	@ApiOperation(value = "Remover um aluguel")
	@DeleteMapping("/remover/aluguel")
	public void removerAluguel(@RequestBody @Valid Aluguel item) {
		alugarRepository.delete(item);
	}

	@ApiOperation(value = "Atualiza um aluguel")
	@PutMapping("/aditar/aluguel")
	public Aluguel atualizarAluguel(@RequestBody @Valid Aluguel item) {
		return alugarRepository.save(item);
	}
}
