package StringApi;

import java.util.List;
import java.util.function.Function;

public class functionexample2 {
	public static void main(String[] args) {
		
		List<Integer> list = List.of(11,55,65,54,24,95);
		
		Function<Integer,Integer> fun=(i)->i*i;
    	//Function<Integer,Integer> fun=(i)->{return i*i;};
		
		for(Integer i:list)
		{
			System.out.println(fun.apply(i));
		}
		
	}

}
