package org.example.onlinrshop.repository;
import org.example.onlinrshop.model.entity.Customer;
import org.example.onlinrshop.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByDescription(String name);
    List<Product> findByCategoryId(Long categoryId);

    List<Product> findByNameIsLike(String s);
}




