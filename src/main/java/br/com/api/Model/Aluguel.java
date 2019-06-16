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
@Table(name = "tb_aluguel")
public class Aluguel implements AluguelInterface, Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@OneToOne(targetEntity = Reserva.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;

	@OneToMany(targetEntity = Aluguel.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_item")
	private List<Item> item;

	private Date dataAluguel;
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
	 * @return the dataAluguel
	 */
	public Date getDataAluguel() {
		return dataAluguel;
	}

	/**
	 * @param dataAluguel the dataAluguel to set
	 */
	public void setDataAluguel(Date dataAluguel) {
		this.dataAluguel = dataAluguel;
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
	public Aluguel alugar(Cliente cliente, ArrayList<Item> item) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Alugar alugar
	 */
	@Override
	public void devolver(Aluguel alugar) {
		// TODO Auto-generated method stub

	}
}
