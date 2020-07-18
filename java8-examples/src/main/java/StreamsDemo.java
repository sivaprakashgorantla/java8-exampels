import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();
		list.add("Sivaprakash Gorantla");
		list.add("Sivaprakash Gorantla");
		list.add("Arunaprakash Gorantla");
		list.add("Arunaprakash Gorantla");
		list.add("Saanvi Sivaprakash Gorantla");
		list.add("Samanvitha Sivaprakash Gorantla");
		
		list.stream().forEach(System.out::println);
		System.out.println("-----------------------Ordered--------------------");
		list.stream().forEachOrdered(System.out::println);
		
		System.out.println("-----------------------Ordered--------------------");
		list.forEach(System.out::println);
		
		System.out.println("-----------------------to List--------------------");
		list.stream().filter(e -> e.contains("Sivaprakash") ).collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("-----------------------to distinct--------------------");
		list.stream().distinct().forEach(System.out::println);
		
		int count = (int)list.stream().count();
		System.out.println("Count : "+count);
		
		System.out.println("-----------------------to Peek--------------------");
		list.stream().distinct().peek(System.out::println).collect(Collectors.toList());
	}

}
