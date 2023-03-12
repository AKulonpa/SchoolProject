package com.examplecompany.verynewdemo;

import java.util.ArrayList;
import java.util.List;

public class OnlineStoreService {
    private List<Customer> customers = new ArrayList<>();
    private List<Product> products = new ArrayList<>();
    private List<Order> orders = new ArrayList<>();

    public Customer addCustomer(Customer customer) {
        customers.add(customer);
        return customer;
    }

    public Customer getCustomer(int id) {
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }

    public void deleteCustomer(int id) {
        customers.removeIf(customer -> customer.getId() == id);
    }

    public Product addProduct(Product product) {
        products.add(product);
        return product;
    }

    public Product getProduct(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }


    public void deleteProduct(int id) {
        products.removeIf(product -> product.getId() == id);
    }

    public Order addOrder(Order order) {
        orders.add(order);
        return order;
    }

    public Order getOrder(int id) {
        for (Order order : orders) {
            if (order.getId() == id) {
                return order;
            }
        }
        return null;
    }

    public void deleteOrder(int id) {
        orders.removeIf(order -> order.getId() == id);
    }

    //for searching products
    public List<Product> searchProducts(String keyword) {
        List<Product> matchingProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().toLowerCase().contains(keyword.toLowerCase())) {
                matchingProducts.add(product);
            }
        }
        return matchingProducts;
    }
}