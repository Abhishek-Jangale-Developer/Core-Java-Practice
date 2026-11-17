package ExceptionHandeling;

public class custom_exception {

	public static void main(String[] args) {
	
		int age=15;
		try
		{
			if (age<18)
			{
				throw new InavalidAgeException("Not Eligible for voting....");
			}
			System.out.println("please vote");
		}
		
		catch(InavalidAgeException ex)
		{
			  ex.printStackTrace();
		}
		
		finally 
		{
          System.out.println("Code Running");  
          }
	}

}

class InavalidAgeException extends Throwable
{
	public InavalidAgeException(String str)
	{
		super(str);
	}
}