package core_practice;

public class aa {
	public static void main (String args[])
	{
	int counter=0;
	for(int i=-2147483648;i<2147483647;i++)
	{
		if(i%2==0)
		{
			System.out.println(i);
			counter++;
		}
	}
	
	System.out.println(counter);

}
}
