package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Product;

@Repository
public interface Repositories extends JpaRepository<Product,Long> {

}
