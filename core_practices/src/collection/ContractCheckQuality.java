package collection;

import java.util.Objects;

public class ContractCheckQuality {
	public static void main(String[] args) {
		
		City c1 = new City("pune");
		City c2 = new City("pune");
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
	}

}
class City
{
	String name;
	public City(String name)
	{
		this.name=name;
	}
	public int hashCode()
	{
		return Objects.hash(this.name);
	}
	
	public boolean equlas(Object obj)
	{
		City c3 = (City)obj;
		
		return this.name.equals(c3.name);
	}
}