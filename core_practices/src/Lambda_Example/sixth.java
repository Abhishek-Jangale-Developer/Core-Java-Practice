package Lambda_Example;

public class sixth {
	public static void main(String[] args) {
		
		Pmt<String,Integer> p =(i,a)->{
			System.out.println(i.length()+a);
		};
		
		p.display("pune",45);
	}

}
interface Pmt<T,A>
{
	void display(T i,A a);
}