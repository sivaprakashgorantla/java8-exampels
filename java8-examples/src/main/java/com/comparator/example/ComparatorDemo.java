package com.comparator.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Student;

public class ComparatorDemo {
	public static void main(String[] args) {
		List<Student> stdList = new ArrayList<Student>();
		
		stdList.add(new Student(1,"abc1","Male",44));
		stdList.add(new Student(12,"abc22","FeMale",45));
		stdList.add(new Student(3,"abc3","Male",46));
		stdList.add(new Student(24,"abc41","FeMale",47));
		stdList.add(new Student(15,"abc15","Male",48));
		stdList.add(new Student(6,"abc6","FeMale",49));
		//stdList.stream().forEach(System.out::println);
		System.out.println(stdList);
		stdList.stream().forEach(System.out::println);
		System.out.println("-------------------------------------");
		//Collections.sort(stdList,(s1,s2)->s1.getName().compareTo(s2.getName()));
		System.out.println(stdList);
		stdList.stream().forEach(System.out::println);
	}
}
