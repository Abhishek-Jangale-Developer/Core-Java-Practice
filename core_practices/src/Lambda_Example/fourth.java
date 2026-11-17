package Lambda_Example;

public class fourth {
	
	public static void main(String[] args) {
		
		I_audit i = ()->{
			System.out.println("ANNA");
		};
		
		i.scanning();
	}

}

interface I_audit
{
	void scanning();
}