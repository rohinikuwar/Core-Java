package com.demo.test;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

public class TestProduct {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("*********Menu**********");
		int choice=0;
		ProductService pservice=new ProductServiceImpl();
		do
		{
			System.out.println("1.add new product\n2remove by id\n 3.remove by name\n");
			System.out.println("4.display all\n5.find by id\n 6. sort by price\n");
			System.out.println("7.display all with qty > given qty\n8.modify price\n9.find by name 10.exit\n ");
			System.out.println("choice :");
			choice=sc.nextInt();
			switch(choice) {
			case 1: pservice.addNewProduct();
			break;
			case 2:System.out.println("Enter Id to remove");
			int id=sc.nextInt();
			boolean status=pservice.removeById(id);
			if(status) {
				System.out.println("Remove Successfully");

			}
			else {
				System.out.println("not found");

			}
			break;
			case 3:System.out.println("Enter name to remove");
			String name=sc.next();
			status=  pservice.removeByName(name);
			if(status) {
				System.out.println("Remove Successfully");

			}
			else {
				System.out.println("not found");

			}
          case 4:
				List<Product> plist=pservice.displayAll();
				Iterator<Product> it=plist.iterator();
				while(it.hasNext()) {
					System.out.println(it.next());
				}
				break;
			case 5:System.out.println("Enter Id to search");
			id=sc.nextInt();
			Product p1=pservice.findById(id);
			if(p1!=null) {
				System.out.println(p1);
			}
			else
			{
				System.out.println("Not found");
			}
			break;
			case 6: List<Product> plist1=pservice.sortByPrice();
			if(plist1!=null)
			{
				for(Product p2:plist1)
				{
					System.out.println(p2);
				}
			}
			break;
			case 7:System.out.println("Enter quantity");
			int qty=sc.nextInt();
			List<Product> pdata=pservice.displayAllqty(qty);
			for(Product p3:pdata)
			{
				System.out.println(p3);
			}
			break;
			case 8:System.out.println("Enter Id to modify price");
			id=sc.nextInt();
			System.out.println("Enter the price to modify");
			float pr=sc.nextFloat();
			status=pservice.modifyPrice(id,pr);
			if(status)
			{
				System.out.println("Modified successfully");
			}
			else
			{
				System.out.println("Not found");
			}
			break;
			case 9:System.out.println("Enter name to find");
			name=sc.next();
			Product p=pservice.findByname(name);
			if(p!=null)
			{
				System.out.println(p);
			}
			else
			{
				System.out.println("Not found");
			}
			break;
			case 10:System.out.println("Thank you for visiting....");
			break;
			}
		}while(choice!=10);
	}

}
