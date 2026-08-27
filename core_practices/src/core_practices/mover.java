package core_practices;

//METHOD OVER LOADING

public class mover {
	public static void main (String args[])
	{
		Money m = new Money();
		m.cash();
	}

}
class Money
{
	public void cash()
	{
		System.out.println("Money is credit");
	}
	
	public void cash(String i,int n)
	{
		System.out.println("Money is debit");
		
	}
}