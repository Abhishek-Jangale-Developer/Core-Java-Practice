package ExceptionHandeling;

public class second {
     public static void main (String args[])
     {
    	 int i=6;
    	 
    	try
    	{
    		if(i/2==0  || i/3==0)
    		{
    			System.out.println("Number is super");
    		}
    	    
    		else
    		{
    			throw new Exception("number is incorrrect"); 
    		}
    	}
    	
    	catch(Exception ex)
    	{
    		System.out.println(ex.getMessage());
    		
    	}
           System.out.println("run all following code......");
     }
     
}
