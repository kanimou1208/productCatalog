package com.productCatalog.models;

import java.util.List;
public class Products {

	public Products() {
	}
private List<ProductList> productList;

public Products(List<ProductList> productList) {
	this.productList = productList;
}

public List<ProductList> getProductList() {
	return productList;
}

public void setProductList(List<ProductList> productList) {
	this.productList = productList;
}


}
