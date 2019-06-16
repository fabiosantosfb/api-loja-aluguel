package br.com.api.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_reserva")
public class Reserva implements ReservaInterface, Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@OneToOne(targetEntity = Reserva.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;

	@OneToMany(targetEntity = Reserva.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "id_item")
	private List<Item> item;

	private Date dataReserva;
	private Date dataEntrega;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the item
	 */
	public List<Item> getItem() {
		return item;
	}

	/**
	 * @param item the item to set
	 */
	public void setItem(List<Item> item) {
		this.item = item;
	}

	/**
	 * @return the dataReserva
	 */
	public Date getDataReserva() {
		return dataReserva;
	}

	/**
	 * @param dataReserva the dataReserva to set
	 */
	public void setDataReserva(Date dataReserva) {
		this.dataReserva = dataReserva;
	}

	/**
	 * @return the dataEntrega
	 */
	public Date getDataEntrega() {
		return dataEntrega;
	}

	/**
	 * @param dataEntrega the dataEntrega to set
	 */
	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	/**
	 * @param Cliente cliente, ArrayList<Item> item
	 */
	@Override
	public Reserva reservar(Cliente cliente, ArrayList<Item> item) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @param Reserva reserva
	 */
	@Override
	public void cancelar(Reserva reserva) {
		// TODO Auto-generated method stub

	}
}
