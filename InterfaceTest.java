interface Birds
{
	public static int a= 1;
	public abstract void fly();
}
interface Animals
{
	void run();
}
public class InterfaceTest implements Birds,Animals
{

	public void fly()
	{
		System.out.println("Birds can fly.");
	}
	public void run()
	{
		System.out.println("Animals can run.");
		
	}
	public static void main(String args[])
	{
		InterfaceTest t = new InterfaceTest();
		t.fly();
		t.run();
	}
	
}
