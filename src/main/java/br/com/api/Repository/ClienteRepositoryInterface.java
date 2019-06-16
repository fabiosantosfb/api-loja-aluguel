package br.com.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.Model.Cliente;

public interface ClienteRepositoryInterface extends JpaRepository<Cliente, Long> {

	Cliente findById(long id);
}
