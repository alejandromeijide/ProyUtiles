package com.companyname.springapp.business.services;

import java.util.List;

import com.companyname.springapp.business.entities.Product;

public class SimpleProductManager implements ProductManager {

    private List<Product> products;

    public List<Product> getProducts() {
        return products; 
    }

    public void increasePrice(int percentage) {
        List<Product> products = this.getProducts();
        if (products != null) {
            for (Product product : products) {
                double newPrice = product.getPrice().doubleValue() * 
                                    (100 + percentage)/100;
                product.setPrice(newPrice);
                //productRepository.save(product);
            }
        }  
    }
	
    public void setProducts(List<Product> products) {
        this.products = products;
    }
}