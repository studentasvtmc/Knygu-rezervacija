package lt.vtmc.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lt.vtmc.books.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
