package Inheritance;


class SA
{
	void display()
	{
		System.out.println("display");
	}
}
class CB extends SA
{
	void showData()
	{
		System.out.println("showdata");
	}
}
public class SingleInheritance {
	public static void main(String... g)
	{
	CB obj = new CB();
	obj.showData();
	obj.display();
	
	}
	

}
