package TostringC;

public class Price {

	private String name;
	private int id;
	
	public Price()
	
{
		
}
	public Price(String name, int id)
	
	{
	this.name=name;
	this.id=id;

	}
	
	public String toString()
	{
		return "price name is " +this.name+ " and id is " +this.id;
	}
}
