package org.example.onlinrshop.repository;

import org.example.onlinrshop.model.entity.Category;
import org.example.onlinrshop.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

   // List<Category> findAll(String name);
}

