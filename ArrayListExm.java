import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListExm  {

	public static void main(String args[])
	{
		List<Emp> hg = new ArrayList<Emp>();
		hg.addAll(
				Arrays.asList(
				new Emp(1,"Ravi"),
				new Emp(4,"Ahul"),
				new Emp(3,"Rahul"),
				new Emp(2,"Jni")
				
				));
		/*Comparator<Emp> comp = new Comparator<Emp>() {
			
			@Override
			public int compare(Emp e1, Emp e2) {
				return e1.getName().compareTo(e2.getName());
			}
		};*/
		System.out.println(hg);
		
		Comparator<Emp> comp = (Emp e1, Emp e2) -> e1.getName().compareTo(e2.getName());
		Collections.sort(hg, comp);
		System.out.println(hg);
		
		Collections.sort(hg, Comparator.comparing(Emp :: getName));
		System.out.println(hg);
		}
}
