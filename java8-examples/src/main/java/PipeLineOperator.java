import java.util.stream.IntStream;

public class PipeLineOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream.of(new int[] {4, 7, 1, 8, 3, 9, 7}).filter((int i) -> i>5).distinct().forEach(System.out::println);

	}

}
