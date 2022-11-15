interface Operation
{
	public int Perform(int x, int y);
}
class sumOfNum
{
	public static void result(int a, int b, Operation ap)
	{
		System.out.println(ap.Perform(a, b));
	}
	public static void main(String args[])
	{
		result(50, 20, (a,b) -> (a+b));
	}
}