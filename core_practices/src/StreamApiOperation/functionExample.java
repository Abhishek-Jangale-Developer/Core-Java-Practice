package StreamApiOperation;

public class functionExample {
	
	public static void main(String[] args) {
		
		function<String,Integer> fun=(s)->{return s.length();};
		
		System.out.println(fun.apply("ediheddb"));
		
		
	}

}
interface function<T,R>
{
	R apply (T t);
}

