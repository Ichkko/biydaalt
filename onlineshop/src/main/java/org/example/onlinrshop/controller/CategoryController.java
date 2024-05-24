package org.example.onlinrshop.controller;

import org.example.onlinrshop.model.entity.Category;
import org.example.onlinrshop.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

@CrossOrigin(maxAge = 3600)
public class CategoryController {
    CategoryService categoryService;
    public CategoryController(CategoryService categoryService){
        this.categoryService = categoryService;

    }
    @GetMapping("/api/categories")
    public List<Category> getCategories(){
        return categoryService.getAllCategories();
    }

    @PostMapping("/api/category")
    public Category addCategory(@RequestBody Category category){
        return categoryService.createCategory(category);
    }
    @PostMapping("/api/categories")
    public List<Category> addCategories(@RequestBody List<Category> categories){
        return categoryService.createCategories(categories);
    }

    @GetMapping("/api/category/{id}")
    public Optional<Category> getCategoryById(@PathVariable Long id){
        return categoryService.getCategoryById(id);
    }
    @PutMapping("/api/category")

    public Category editCategory(@RequestBody Category category){
        return categoryService.updateCategory(category);
    }
    @DeleteMapping("/api/category/{id}")
    public String deleteCategory(@PathVariable Long id){
        return categoryService.deleteCategoryById(id);
    }


}
