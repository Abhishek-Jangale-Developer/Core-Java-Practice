package collection;

public class contract_1 {
	public static void main(String[] args) {
		/*  1.hashCode()-
		 *  2.equals()-It is contract with itself.(5 Contract)
		 *  3.hashCode() and .equls
 		 */
		
		Students s1 = new Students(101,"Pravin");
		Students s2 = new Students(101,"Pravin");
		Students s3 = new Students(103,"Nitesh");
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
	}

}

class Students
{
	int id;
	String name;
	
	public Students(int id,String name)
	{
		this.id = id;
		this.name=name;
	}
	
	public int hashCode()
	{
		return this.id + this.name.length();
	}
	
	public boolean equals(Object obj)
	{
		
		Students s=(Students)obj;
		
		return this.id==s.id && this.name.equals(s.name);
		//return this.id.equals(s.id);
	}
}