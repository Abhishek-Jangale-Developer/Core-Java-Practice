package ExceptionHandeling;

public class pipe_operator {

	public static void main(String[] args) {
		
		int attendence = 8;
		
		try
		{
			if(attendence<99)
			{
				throw new InvalidattendenceException("Pravin attendence");
			}
			
			else if(attendence<80)
			{
				throw new Invalidattendence2Exception();
			}
			
			else if(attendence<70)
			{
				throw new Invalidattendence3Exception();
			}
			
			else
			{
				System.out.println("Invalid Attendence");
			}
		}
		
		catch(Exception | InvalidattendenceException ex)
		{
			ex.printStackTrace();
		}
		
		
		
		
		finally
		{
		System.out.println("USS");
		}
		
	}
}

class InvalidattendenceException extends Throwable
{
	public InvalidattendenceException(String str)
	{
		super(str);
	}
}

class Invalidattendence2Exception extends Exception
{
	public Invalidattendence2Exception()
	{
		super("This is Nitesh ");
	}
}

class Invalidattendence3Exception extends Exception
{
	public Invalidattendence3Exception()
	{
		super("bugih");
	}
}