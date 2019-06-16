package br.com.api.Model;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_cliente")
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotNull
	private String nome;

	/**
	 * @return
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * @return
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * 
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @param cliente
	 * @return
	 */
	public Cliente buscar(Cliente cliente) {
		return new Cliente();
	}

	/**
	 * 
	 * @return
	 */
	public ArrayList<Cliente> listar() {
		return new ArrayList<Cliente>();
	}

	/**
	 * 
	 * @param cliente
	 */
	public void salvar(Cliente cliente) {

	}
}
