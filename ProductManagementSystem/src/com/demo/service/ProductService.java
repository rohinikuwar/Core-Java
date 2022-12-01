package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

public interface ProductService {

	void addNewProduct();

	List<Product> displayAll();

	Product findById(int id);

	boolean removeById(int id1);

	boolean removeByName(String name);


	Product findByname(String name);

	List<Product> sortByPrice();

	List<Product> displayAllqty(int qty);

	boolean modifyPrice(int id, float pr);





	

}
