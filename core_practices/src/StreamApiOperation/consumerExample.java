package StreamApiOperation;

public class consumerExample {
	
	public static void main(String[] args) {
		
		consumer<String> cons=(t)->{System.out.println(t.toLowerCase());};
		
		cons.accept("ATNDKKD");
		
	}

}
interface consumer<T>
{
	void accept(T t);
}