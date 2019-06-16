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

import br.com.api.Model.Item;
import br.com.api.Repository.ItemRespositoryInterface;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST - Itens")
public class ItemController {

	@Autowired
	ItemRespositoryInterface itemRespository;

	@ApiOperation(value = "Retorna uma lista de item")
	@GetMapping("/listar/itens")
	public List<Item> listarItem() {
		return itemRespository.findAll();
	}

	@ApiOperation(value = "Retorna uma unico item")
	@GetMapping("/buscar/item/{id}")
	public Item buscarItem(@PathVariable(value = "id") long id) {
		return itemRespository.findById(id);
	}

	@ApiOperation(value = "Salva um item")
	@PostMapping("/salvar/item")
	public Item salvarItem(@RequestBody @Valid Item item) {
		return itemRespository.save(item);
	}

	@ApiOperation(value = "Remover um item")
	@DeleteMapping("/remover/item")
	public void removerItem(@RequestBody @Valid Item item) {
		itemRespository.delete(item);
	}

	@ApiOperation(value = "Atualiza um item")
	@PutMapping("/aditar/item")
	public Item atualizarItem(@RequestBody @Valid Item item) {
		return itemRespository.save(item);
	}
}
