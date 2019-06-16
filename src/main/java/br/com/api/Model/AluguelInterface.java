package br.com.api.Model;

import java.util.ArrayList;

public interface AluguelInterface {
	public Aluguel alugar(Cliente cliente, ArrayList<Item> item);

	public void devolver(Aluguel alugar);
}
