package StringApi;

import java.util.function.Function;

public class functionexample4 {
	public static void main(String[] args) {
		
		Function<String,Integer> fun=s->s.length();
		
		//System.out.println(fun.apply("Garba"));  o/p=> 5
		
		Function<String,Integer>fun2=fun.andThen((i)->{return i*i;});
		
		System.out.println(fun2.apply("Garba"));  //o/p=> 25
	}

}
