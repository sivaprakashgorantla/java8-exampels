package com.gsp.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.gsp.entities.Person;

public class SortingDemo {
	public static void main(String[] args) {
		List<Person> listPerson = new ArrayList<Person>();
		listPerson.add(new Person(1001,"Sivaprakash","Gorantla"));
		listPerson.add(new Person(1001,"Arunaprakash","Gorantla"));
		listPerson.add(new Person(1001,"Saanvi Sivaprakash","Gorantla"));
		listPerson.add(new Person(1001,"Samanvitha Sivaprakash","Gorantla"));
		
		System.out.println("Beore Sorting :::");
		listPerson.forEach(System.out::println);
		
		
		Collections.sort(listPerson,new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
			
		});
		
		System.out.println("After  Sorting :::");
		
		listPerson.forEach(System.out::println);
	}
}
