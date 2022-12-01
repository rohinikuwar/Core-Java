package com.demo.comparators;

import java.util.Comparator;

import com.demo.beans.Product;

public class MyNameComparator implements Comparator<Product> {

	@Override
	public int compare(Product a1, Product a2) {
		System.out.println("In comparator");
		System.out.println(a1.getName()+"--------"+a2.getName());
		return (a1.getName().compareTo(a2.getName()));
		
	}

}
