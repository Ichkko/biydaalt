package org.example.onlinrshop.service;

import org.example.onlinrshop.model.entity.Customer;
import org.example.onlinrshop.model.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> findByProductDescription(String name);
    List<Product> getAllProducts();

    //    Neg hereglechiin medeelel hadgalah
    public Product createProduct(Product product);

    //    Olon hereglegchiin medeelel hadgalah
    List<Product> createProducts(List<Product> products);

    //    Neg hereglegchiin medeelel avah
    public Optional<Product> getProductById(Long id);

    //    neg hereglegchiin medeelel zasvarlah
    public Product updateProduct(Product product);

    //    Neg hereglegchiin medeelel ustgah
    public String deleteProductById(Long id);
    List<Product>findByNameIsLike(String name);

    List<Product> findByCategoryId(Long categoryId);
}