package core_practices;

public class dnd {

	public static void main(String[] args) {
		
		Father father = new Son();
		
		father.farming();
		
	}
}
class Father
{
	public void farming()
	{
		System.out.println("Every frmer his farm");
	}
	
	public void irrigation()
	{
		System.out.println("Tradional approch");
	}
}

class Son extends Father
{   
	public void farming()
	{
	System.out.println("Unique approch..");
	}

}
