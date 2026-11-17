package ExceptionHandeling;

public class custom_Exception_2 {
	public static void main(String[] args) {
				
		String traffic_light = "red";
		
		try
		{
			//System.out.println(10/0);
			
			if(traffic_light.equals("red"))
			{
				throw new RedSignalException();  //Trowable
			}
			
			else if(traffic_light.equals("yellow"))
			{
				throw new YellowSignalException();
			}
			
			else if(traffic_light.equals("green"))
			{
				throw new GreenSignalException();
			}
			
			else
			{
				System.out.println("Signal not working");
			}
		}
		
//		catch(Exception ex)
//		{
//			ex.printStackTrace();
//		}
//		
		catch(RedSignalException ex)
		{
			System.out.println("*");
			ex.printStackTrace();
		}
		
		catch(YellowSignalException ex)
		{
			ex.printStackTrace();
		}
		
		catch(GreenSignalException ex)
		{
			ex.printStackTrace();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		System.out.println("Road safety first");
	}

}

class RedSignalException extends Exception
{
	public RedSignalException()
	{
		super("Signal is red Please Stop!");
	}
	}

class YellowSignalException extends Exception
{
	public YellowSignalException()
	{
		super("Slow down");
	}
}

class GreenSignalException extends Exception
{
	public GreenSignalException()
	{
		super("Go fast");
	}
}
