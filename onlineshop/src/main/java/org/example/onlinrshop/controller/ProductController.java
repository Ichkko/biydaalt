package org.example.onlinrshop.controller;
import org.example.onlinrshop.model.entity.Customer;
import org.example.onlinrshop.model.entity.Product;
import org.example.onlinrshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import org.example.onlinrshop.model.entity.Customer;
import org.example.onlinrshop.model.entity.Product;
import org.example.onlinrshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

@CrossOrigin(maxAge = 3600)


public class ProductController {
//    ProductService productService;

    @Autowired
    private ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;

    }
    @GetMapping("/api/products")
    public List<Product> getProducts(){
        return productService.getAllProducts();
    }
    @PostMapping("/api/product")
    public Product addProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }
    @PostMapping("/api/products")
    public List<Product> addProducts(@RequestBody List<Product> products){
        return productService.createProducts(products);
    }

    @GetMapping("/api/product/{id}")
    public Optional<Product> getProductById(@PathVariable Long id){
        return productService.getProductById(id);
    }
    @PutMapping("/api/product")

    public Product editProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }
    @DeleteMapping("/api/product/{id}")
    public String deleteProduct(@PathVariable Long id){
        return productService.deleteProductById(id);
    }
    @GetMapping("/api/products/{name}")
    public List<Product> getProductsByNameIsLike(@PathVariable String name){
        return productService.findByNameIsLike(name);
    }


    @GetMapping("/api/products/category/{categoryId}")
    public List<Product> getProductsByCategoryId(@PathVariable Long categoryId) {
        return productService.findByCategoryId(categoryId);
}}