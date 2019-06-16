package br.com.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.Model.Item;

public interface ItemRespositoryInterface extends JpaRepository<Item, Long> {

	Item findById(long id);
}
