package StringApi;

import java.util.List;
import java.util.function.Consumer;

public class FinEvenNumbersFrom2DList {
	public static void main(String[] args) {
		
		List<Integer> l1 = List.of(21,52,855,75,65);
		List<Integer> l2 = List.of(21,532,845,75,685);
		List<Integer> l3 = List.of(21,52,85,75,65);
		List<List<Integer>> l4 = List.of(l1,l2,l3);
		
		System.out.println(l4);
		
		Two_d t = new Two_d();
		t.accept(l4);
		
	}

}
class Even_numbers implements Consumer<List<Integer>>
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


class Two_d implements Consumer<List<List<Integer>>>
{
	Even_numbers nums = new Even_numbers();
	
	public void accept(List<List<Integer>> t)
	{
		for(int i=0;i<t.size();i++)
		{
		nums.accept(t.get(i));
		System.out.println("-----------------");
		}
	}
}