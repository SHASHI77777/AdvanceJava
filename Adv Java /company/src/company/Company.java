package company;

public class Company 
{
	int id;
	String name;
	Developer dev;
	Laptop l;
	Desktop d;
	public static void main(String[] args) 
	{
		Company c=new Company();
		c.id=102;
		c.name="Dell";
		c.dev=new Developer();
		c.l=new Laptop();
		c.d=new Desktop();
		c.dev.code(c.d);
	}
}