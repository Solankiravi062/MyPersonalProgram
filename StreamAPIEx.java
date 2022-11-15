import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPIEx {

	public static void main(String args[])
	{
		/*
		 * IntStream a = IntStream.iterate(5, x-> x+1); a.limit(10).forEach(System.out
		 * :: println);
		 */
		Stream.of(1,2,3,5,6,4).filter(x-> x<4).forEach(System.out :: println);
		
	}
	
}
