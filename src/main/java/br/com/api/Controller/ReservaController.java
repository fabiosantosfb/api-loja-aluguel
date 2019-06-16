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

import br.com.api.Model.Reserva;
import br.com.api.Repository.ReservaRespositoryInterface;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST - Reserva")
public class ReservaController {

	@Autowired
	ReservaRespositoryInterface reservaRespository;

	@ApiOperation(value = "Retorna uma lista das reserva")
	@GetMapping("/listar/reservas")
	public List<Reserva> listarReserva() {
		return reservaRespository.findAll();
	}

	@ApiOperation(value = "Retorna uma unica reserva")
	@GetMapping("/buscar/reserva/{id}")
	public Reserva buscarReserva(@PathVariable(value = "id") long id) {
		return reservaRespository.findById(id);
	}

	@ApiOperation(value = "Salva uma reserva")
	@PostMapping("/salvar/reserva")
	public Reserva salvarReserva(@RequestBody @Valid Reserva item) {
		return reservaRespository.save(item);
	}

	@ApiOperation(value = "Remover um reserva")
	@DeleteMapping("/remover/reserva")
	public void removerReserva(@RequestBody @Valid Reserva item) {
		reservaRespository.delete(item);
	}

	@ApiOperation(value = "Atualiza um reserva")
	@PutMapping("/aditar/reserva")
	public Reserva atualizarReserva(@RequestBody @Valid Reserva item) {
		return reservaRespository.save(item);
	}
}
