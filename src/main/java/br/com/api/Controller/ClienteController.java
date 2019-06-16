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

import br.com.api.Model.Cliente;
import br.com.api.Repository.ClienteRepositoryInterface;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST - Clientes")
public class ClienteController {

	@Autowired
	ClienteRepositoryInterface clienteRespository;

	@ApiOperation(value = "Retorna uma lista de cliente")
	@GetMapping("/listar/clientes")
	public List<Cliente> listarCliente() {
		return clienteRespository.findAll();
	}

	@ApiOperation(value = "Retorna uma unico cliente")
	@GetMapping("/buscar/cliente/{id}")
	public Cliente buscarCliente(@PathVariable(value = "id") long id) {
		return clienteRespository.findById(id);
	}

	@ApiOperation(value = "Salva um cliente")
	@PostMapping("/salvar/cliente")
	public Cliente salvarCliente(@RequestBody @Valid Cliente cliente) {
		return clienteRespository.save(cliente);
	}

	@ApiOperation(value = "Remover um cliente")
	@DeleteMapping("/remover/cliente")
	public void removerCliente(@RequestBody @Valid Cliente cliente) {
		clienteRespository.delete(cliente);
	}

	@ApiOperation(value = "Atualiza um cliente")
	@PutMapping("/aditar/cliente")
	public Cliente atualizarCliente(@RequestBody @Valid Cliente cliente) {
		return clienteRespository.save(cliente);
	}
}
