package com.productCatalog.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productCatalog.models.Product;
import com.productCatalog.repository.ProductRepository;

@Service
public class ProductCatalogService {

	@Autowired
	ProductRepository productRepository;



//update the ProductQuantity
	public Optional<Product> updateProductQuantity(String id, int quantity) {
		Optional<Product> product = productRepository.findById(id);
		Product p1=product.get();
		int availableQuantity = p1.getAvailableQuantity();
		p1.setAvailableQuantity(availableQuantity-quantity);
		productRepository.save(p1);
		return product;

	}

}
