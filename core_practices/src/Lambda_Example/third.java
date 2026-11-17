package Lambda_Example;

public class third {
	public static void main(String[] args) {
		
		College c = ()->{
			System.out.println("MMC");
		};
		
		c.practical();
	}

}
interface College
{
	void practical();
}