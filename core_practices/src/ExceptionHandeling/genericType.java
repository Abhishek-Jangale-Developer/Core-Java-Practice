package ExceptionHandeling;

public class genericType {
	public static void main(String[] args) {
		
		I_NYC<String, String> i = new One();
		
		
	}

}

interface I_NYC <T,R>
{
	public R run(T t1,T t2);	
}

class One implements I_NYC<String, String>
{
	
}