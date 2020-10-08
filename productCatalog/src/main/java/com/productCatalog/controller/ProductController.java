package com.productCatalog.controller;

import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.productCatalog.models.Product;
import com.productCatalog.models.ProductList;
import com.productCatalog.models.Products;
import com.productCatalog.services.ProductCatalogService;

@RestController
@RequestMapping("/api/productCatalog")
public class ProductController {

	@Autowired
	ProductCatalogService productCatalogService;

//Api to update the product quantity
	@PutMapping
	@RequestMapping(value="/updateQuantity",consumes = "application/json")
	@ResponseBody
	private void updateQuantity(@RequestBody Products products) {
		List<ProductList> productList = products.getProductList();
		 productList
		           .forEach(product->getUpdatedQuantity(product).get());
		
		
	}
	private Optional<Product> getUpdatedQuantity(ProductList productList){
		 return productCatalogService.updateProductQuantity(productList.getProductId() , productList.getQuantity());
	}
	
}
