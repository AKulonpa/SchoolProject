package com.examplecompany.verynewdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VerynewRestController {

    OnlineStoreService pc;

    @Autowired
    public VerynewRestController(OnlineStoreService pc) {
        this.pc = pc; 
    }

    @PostMapping("/customer")
    public Customer createCustomer(@RequestBody Customer customer) {
        return pc.addCustomer(customer);
    }

    @GetMapping("/customer/{id}")
    public Customer getCustomer(@PathVariable int id) {
        return pc.getCustomer(id);
    }

    @DeleteMapping("/delcustomer/{id}")
    public void deleteCustomer(@PathVariable int id) {
        pc.deleteCustomer(id);
    }

    @PostMapping("/product")
    public Product createProduct(@RequestBody Product product) {
        return pc.addProduct(product);
    }

    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable int id) {
        return pc.getProduct(id);
    }

    @DeleteMapping("/delproduct/{id}")
    public void deleteProduct(@PathVariable int id) {
        pc.deleteProduct(id);
    }

    @PostMapping("/order")
    public Order createOrder(@RequestBody Order order) {
        return pc.addOrder(order);
    }

    @GetMapping("/order/{id}")
    public Order getOrder(@PathVariable int id) {
        return pc.getOrder(id);
    }

    @DeleteMapping("delorder/{id}")
    public void deleteOrder(@PathVariable int id) {
        pc.deleteOrder(id);
    }

    @GetMapping("/products/search")
    public List<Product> searchProducts(@RequestParam(value = "keyword") String keyword) {
        return pc.searchProducts(keyword);
    }

}