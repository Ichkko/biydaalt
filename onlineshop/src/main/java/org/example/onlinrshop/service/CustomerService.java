package org.example.onlinrshop.service;

import org.example.onlinrshop.model.entity.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> findByCustomerAddress(String name);
    List<Customer> getAllCustomers();

    //    Neg hereglechiin medeelel hadgalah
    public Customer createCustomer(Customer customer);

//    Olon hereglegchiin medeelel hadgalah
     List<Customer> createCustomers(List<Customer> customers);

//    Neg hereglegchiin medeelel avah
    public Optional<Customer> getCustomerById(Long id);

//    neg hereglegchiin medeelel zasvarlah
     public Customer updateCustomer(Customer customer);

//    Neg hereglegchiin medeelel ustgah
     public String deleteCustomerById(Long id);

    List<Customer>findByNameIsLike(String name);
    interface CategoryService {
    }

}
