package StreamApiOperation;

public class supplierExample {
	public static void main(String[] args) {
		
		Supplier<String> sup=()->{return new String("abcd");};
		
		System.out.println(sup.get());
	}

}
interface Supplier
{
	T get();
}