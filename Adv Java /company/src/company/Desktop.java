package company;

public class Desktop implements Computer
{
	@Override
	public void compile()
	{
		System.out.println("code compiled in desktop");
	}
}