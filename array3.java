package core_practice;
//highest value program
public class array3 {
	public static void main (String args[])
	{
		int[] arr = {-3,-8,-3,-2,-7};
		int num = -2147483648;
		
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]>num)
			{
				num = arr[i];
			}
		}
		System.out.println(num);
		}

}
