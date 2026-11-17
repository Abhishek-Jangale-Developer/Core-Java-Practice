package ExceptionHandeling;

public class hierarchy_1 {
	public static void main(String[] args) 
	{
		int num = 10;
		 
		try
		{
			
			if(num>5)
			{
				throw new Exception();
				
			}
			else
			{
				System.out.println("this is correct ");
			}
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		System.out.println("gugh");
		
	}

}
