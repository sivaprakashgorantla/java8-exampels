package com.stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import entities.*;
public class JavaStreamExample {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        
        
        productsList.stream().filter(p -> p.getPrice() > 0).map(p->p.getPrice()).collect(Collectors.toList()).forEach(System.out::println);;
        
        System.out.println("--------------------------------------");
        Stream.iterate(1, i->i+1).filter(i->i%5==0).limit(1000).forEach(System.out::println);
        
        double sum = productsList.stream().collect(Collectors.averagingDouble(p -> p.getPrice()));
        
        System.out.println("Sum is :"+sum);
	}
}
