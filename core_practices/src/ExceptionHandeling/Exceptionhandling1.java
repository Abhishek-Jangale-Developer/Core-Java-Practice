package ExceptionHandeling;

public class Exceptionhandling1 {
	public static void main(String[]args)
	{
		int age=17;
		try
		{
			if(age<18)
			{
				throw new Exception("age is invaild");
				
			}
			else
			{
				System.out.println("Voter");
			}
				
		}
		
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			
			//ex.printStackTrace();
			
		}
		
		System.out.println("kkekkgrjn;");
	}

}
