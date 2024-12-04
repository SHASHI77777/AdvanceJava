package company;

public class Laptop implements Computer
{
	@Override
	public void compile()
	{
		System.out.println("code compiled in laptop");
	}
}