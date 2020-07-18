package functional.supplier;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import entities.Student;

public class StudentSuppler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier studentSupplier = () -> new Student(1, "Sivaprakash Gorantla", "M", 40);
		Student student = (Student)studentSupplier.get();
		System.out.println(student);

		
		Supplier ramdumNumber =() -> new Random().nextInt(10);
		
		Stream.generate(ramdumNumber).limit(100).forEach(System.out::println);
		
		
		 
	}

}
