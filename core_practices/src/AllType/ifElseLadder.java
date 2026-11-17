package AllType;

public class ifElseLadder {
	public static void main (String args[])
	{
		int mark = 90;
		
		if(mark>=0 && mark<=35)
		{
			System.out.println("Fail");
		}
		
		else if(mark>=36 && mark<=50)
		{
			System.out.println("grade=C");
		}
		
		else if(mark>=51 && mark<=70)
		{
			System.out.println("grade=B");
		}
		
		else if(mark>=71 && mark<=100)
				{
                    System.out.println("grade=A");			
				}
		
		else
		{
			System.out.println("Envalid number");
		}
	}
	

}
