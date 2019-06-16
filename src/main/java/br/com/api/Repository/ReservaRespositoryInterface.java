package br.com.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.Model.Reserva;

public interface ReservaRespositoryInterface extends JpaRepository<Reserva, Long> {

	Reserva findById(long id);
}
