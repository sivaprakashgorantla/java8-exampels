import java.util.stream.IntStream;

public class IntSteamloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//IntStream.range(0, 10).filter(i -> i%2==0).forEach(System.out::println);
		//IntStream.rangeClosed(0, 10).filter(i -> i%2==0).forEach(System.out::println);
		
		
		//IntStream.iterate(0, i -> i+2 ).limit(1000).forEach(System.out::println);
		
		boolean flag = IntStream.range(1, 5).anyMatch(i -> i % 2 == 0);  
		System.out.println("Flag : "+flag);
	}

}
