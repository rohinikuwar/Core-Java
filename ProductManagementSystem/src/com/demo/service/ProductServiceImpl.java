package com.demo.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.demo.beans.Product;
import com.demo.comparators.MyIdComparator;
import com.demo.comparators.MyNameComparator;

public class ProductServiceImpl implements ProductService {
	static List<Product> plist;
	static {
		plist =new ArrayList<>();
		plist.add(new Product(11,"table",12,8900));
		plist.add(new Product(2,"wardrobe",15,7553));
		plist.add(new Product(12,"tv",6,2300));
		plist.add(new Product(8,"fan",4,3580));
	
	}
	@Override
	public void addNewProduct() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter product Id");
		int id=sc.nextInt();
		System.out.println("Enter product name");
		String pname=sc.next();
		System.out.println("Enter product quantity");
		int qnt=sc.nextInt();
		System.out.println("Enter product price");
		float price=sc.nextFloat();
		Product p=new Product(id,pname,qnt,price);
		plist.add(p);
	}
	@Override
	public List<Product> displayAll() {
		if(plist.size()>0) 
			return plist;
		return null;
	}
	@Override
	public Product findById(int id) {
		int pos=plist.indexOf(new Product(id));
		if(pos!=-1)
		{
			return plist.get(pos);
		}
		return null;
	}
	@Override
	public boolean removeById(int id) {
		return plist.remove(new Product(id));

	}
	@Override
	public boolean removeByName(String name) {
		Product p=findByname(name);
		if(p!=null) {
			Scanner sc=new Scanner(System.in);
			System.out.println(p);
			System.out.println("Do you want to delete this?    y/n");
			String  ans=sc.next();
			if(ans.equals("y"))
			{
				plist.remove(p);
				return true;
			}
			return false;
		}
		else {
			return false;
		}
	}
	@Override
	public Product findByname(String name) {
		for(Product p:plist) {
			if(p.getName().equals(name))
			{
				return p;
			}
		}
		return null;
	}
	@Override
	public List<Product> sortByPrice() {
		//Collections.sort(plist);
		plist.sort(null);
		//plist.sort(new MyNameComparator());
		//plist.sort(new MyIdComparator());
	return plist;
	}
	@Override
	public List<Product> displayAllqty(int qty) {
	return plist.stream().filter(x->x.getQty()>qty).collect(Collectors.toList());
	}
	
	@Override
	public boolean modifyPrice(int id, float pr) {
		int pos= plist.indexOf(new Product(id));
		if(pos!=-1)
		{
			Product p=plist.get(pos);
			p.setPrice(pr);
			return true;
		}
       return false;
       }
	
}






