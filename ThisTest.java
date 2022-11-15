class ThisDemo
{
	int r;
	public void data(int r)
	{
		this.r = r;
	}
	public void display()
	{
		System.out.println("Value is " + r);
	}
}

public class ThisTest {

	public static void main(String args[])
	{
		ThisDemo t = new ThisDemo();
		t.data(10);
		t.display();
	}
}
