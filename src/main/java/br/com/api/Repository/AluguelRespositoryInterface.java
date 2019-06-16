package br.com.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.Model.Aluguel;

public interface AluguelRespositoryInterface extends JpaRepository<Aluguel, Long> {

	Aluguel findById(long id);
}
