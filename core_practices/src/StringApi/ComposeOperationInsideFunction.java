package StringApi;

import java.util.List;
import java.util.function.Function;

public class ComposeOperationInsideFunction {

	public static void main(String[] args) {
		
		Function<String, Integer> fun=(s)-> {return s.length();};
		
		List<String> list = List.of("hid","nuhg","nuhgi","nuhins");
		
		//Enhance for loop or forest loop
		
		for(String s:list)
		{
			System.out.println(fun.apply(s));
		}
		
              System.out.println("-----------or----------");
              
         for(int i=0;i<list.size();i++)
         {
        	 System.out.println(fun.apply(list.get(i)));
         }
	
	}

}
