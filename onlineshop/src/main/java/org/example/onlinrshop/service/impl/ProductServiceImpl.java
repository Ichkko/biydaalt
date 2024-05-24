package org.example.onlinrshop.service.impl;

import org.example.onlinrshop.model.entity.Customer;
import org.example.onlinrshop.model.entity.Product;
import org.example.onlinrshop.repository.ProductRepository;
import org.example.onlinrshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProductServiceImpl implements ProductService {
//    private final ProductRepository productRepository;
    @Autowired
    private ProductRepository productRepository;
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository= productRepository;
    }

    @Override
    public List<Product> findByProductDescription(String name) {
        return productRepository.findAllByDescription(name);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> createProducts(List<Product> products) {
        return productRepository.saveAll(products);
    }

    @Override
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public Product updateProduct(Product product) {
        Product findProduct= productRepository.findById(product.getId()).orElse(null);
        findProduct.setDescription(product.getDescription());
        findProduct.setLast_update(product.getLast_update());
        findProduct.setName(product.getName());
        findProduct.setPrice(product.getPrice());
        findProduct.setCategory(product.getCategory());

        return productRepository.save(findProduct);
    }

    @Override
    public String deleteProductById(Long id) {
        productRepository.deleteById(id);
        return id+"Hereglegchiin medeelelusdav...";
    }
    @Override
    public List<Product>findByNameIsLike(String name){
        return  productRepository.findByNameIsLike("%"+name+"%");
    }


    public List<Product> findByCategoryId(Long categoryId) {
        return productRepository.findByCategoryId(categoryId);
    }
}
