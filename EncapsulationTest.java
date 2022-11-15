class Tcs
{
	private int emplpoyeeList;
	public void setEmployeeList(int id)
	{
		emplpoyeeList = id;
	}
	public int getEmployeeList()
	{
		return emplpoyeeList;
	}
}

public class EncapsulationTest extends Tcs {

	public static void main(String args[])
	{
		Tcs t = new Tcs();
		t.setEmployeeList(1002);
		System.out.println(t.getEmployeeList());
		
	}
}
