package Lambda_Example;

public class fifth {
	public static void main(String[] args) {
		
		School<String> sch =(i,j)->{
			System.out.println(i.toUpperCase()+"::"+j.toUpperCase());
		};
		
		sch.display("abcd","klop");
		
		
		School<Integer> sch2 =(i,j)->{
			System.out.println(i+j);
		};
		
		sch2.display(123,524);
	}
}

interface School<T>
{
	void display(T i,T j);
}