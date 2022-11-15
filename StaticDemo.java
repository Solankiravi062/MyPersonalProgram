class Employee
{
	int empId;
	String name;
	static String companyName = "TCS";
	Employee(int id,String name)
	{
		this.empId = id;
		this.name = name;
		
	}
	void display()
	{
		System.out.println("Hi, ID is "+empId+" "+name+ " "+companyName);
	}
	
}
public class StaticDemo {

	public static void main(String args[])
	{
		Employee i1 = new Employee(101,"Ravi");
		Employee i2 = new Employee(102,"Dev");
		i1.display();
		i2.display();
	}
}
