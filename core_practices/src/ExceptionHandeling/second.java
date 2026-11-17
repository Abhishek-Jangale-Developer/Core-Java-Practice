package ExceptionHandeling;

public class second {
     public static void main (String args[])
     {
    	 int i=7;
    	 
    	try
    	{
    		if(i%2!=0  || i%3!=0)
    		{
    			throw new Exception("number is incorrrect"); 
    		}
    	    
    		else
    		{
    			System.out.println("Number is super");
    		}
    	}
    	
    	catch(Exception ex)
    	{
    		System.out.println(ex.getMessage());
    		
    	}
           System.out.println("run all following code......");
     }
     
}
