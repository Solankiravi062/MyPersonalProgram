class Counter
{
	 int a=0;
	Counter()
	{
		a++;
		System.out.println("Counter is = " + a);
	}
	
}
public class CounterDemo {
	public static void main(String args[])
	{
		Counter a = new Counter();
		Counter b = new Counter();
		Counter c = new Counter();
		
	}
}
