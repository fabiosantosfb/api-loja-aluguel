package br.com.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.api.Model.Tipo;

@Repository
public interface TipoRespositoryInterface extends JpaRepository<Tipo, Long> {

	Tipo findById(long id);
}
