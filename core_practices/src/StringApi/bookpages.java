package StringApi;

import java.util.List;
import java.util.function.Function;

public class bookpages {
	public static void main(String[] args) {
		
	
		
		
		
				
				Function<String, Integer> fun=(s)-> {return s.length();};
				
				List<String> list = List.of("hid","nuhg","nuhgi","nuhins");
				
				//function<String,Integer> fun2 = after.compose({return i.} )
				
				//Inhence for loop
				
				for(String s:list)
				{
					System.out.println(fun.apply(s));
				}

			}

		}

