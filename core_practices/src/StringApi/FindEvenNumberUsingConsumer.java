package StringApi;

import java.util.List;
import java.util.function.Consumer;

public class FindEvenNumberUsingConsumer {

	public static void main(String[] args)
	{
		List<Integer> I1 = List.of(21,52,85,75,65);
		List<Integer> I2 = List.of(221,532,845,775,685);
		
		Even_number even = new Even_number();
		
		even.accept(I1);
		System.out.println("-------------------------");
		even.accept(I2);

	}

}
class Even_number implements Consumer<List<Integer>>
{
	public void accept(List<Integer> t)
	{
		for(int i=0; i<t.size();i++)
		{
			if(t.get(i)%2==0)
			{
				System.out.println(t.get(i));
			}
		}
	}
}