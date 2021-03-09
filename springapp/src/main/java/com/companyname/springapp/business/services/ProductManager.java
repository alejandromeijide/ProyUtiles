package com.companyname.springapp.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.companyname.springapp.business.entities.Product;
import com.companyname.springapp.business.repositories.ProductRepository;

@Service
public class ProductManager {

  @Autowired
  private ProductRepository productRepository;

  public List<Product> getProducts() {
      return (List<Product>) productRepository.findAll();
  }

  public void increasePrice(int percentage) {
      List<Product> products = (List<Product>) productRepository.findAll();
      if (products != null) {
    	  
//    	  for(int i= 0;i<products.size(); i++) {
//    		  Product product = products.get(i);
//          	double newPrice = product.getPrice().doubleValue() * 
//                  (100 + percentage)/100;
//			product.setPrice(newPrice);
//			productRepository.save(product);
//    	  }
    	  
    	  
    	  
          for (Product product : products) {
              double newPrice = product.getPrice().doubleValue() * 
                                  (100 + percentage)/100;
              product.setPrice(newPrice);
              productRepository.save(product);
          }
      }  
  }
}