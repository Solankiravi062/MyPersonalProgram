interface A
{
	public void show();
	
}
public class AnnonymousDemo 
{
	public static void main(String args[])
	{
		A a =  ()-> { System.out.println("Hello, Rahul");};
		a.show();
	}
}