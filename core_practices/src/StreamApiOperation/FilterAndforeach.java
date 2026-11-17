package StreamApiOperation;

import java.util.List;

public class FilterAndforeach {

	public static void main(String[] args) 
	{
		List<Integer> list = List.of(32,65,96,302,45);
		
		list.stream().filter((i)-> {return i>40;}).forEach((i) -> {System.out.println(i);});
	}
}