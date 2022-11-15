abstract class Vehical
{
	abstract public void tyres();
}


public class AbstractTest extends Vehical  {

	public void tyres()
	{
		System.out.println("Car has four wheels.");
	}
	public static void main(String args[])
	{
		AbstractTest a = new AbstractTest();
		a.tyres();
	}

	
}
