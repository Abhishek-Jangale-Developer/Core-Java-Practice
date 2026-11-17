package Lambda_Example;

public class First {
	
	public static void main(String[] args) {
		
		I_run fun = new I_run() {
			public void run()
			{
				System.out.println("method Overridden");
			}
		};
		fun.run();
	}
}
interface I_run
{
	void run();
}