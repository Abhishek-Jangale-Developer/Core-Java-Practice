package StringApi;

import java.util.function.Function;

public class identityFunction {
   public static void main(String[] args) {
	
	   Function<Integer,Integer> fun=Function.identity();//i->i;
			   
	   System.out.println(fun.apply(101));
	   

	}

}
