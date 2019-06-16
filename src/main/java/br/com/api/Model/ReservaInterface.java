package br.com.api.Model;

import java.util.ArrayList;

public interface ReservaInterface {
	public Reserva reservar(Cliente cliente, ArrayList<Item> item);

	public void cancelar(Reserva reserva);
}
