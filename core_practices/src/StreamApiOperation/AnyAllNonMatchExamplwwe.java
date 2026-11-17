package StreamApiOperation;

public class AnyAllNonMatchExamplwwe {
	public static void main(String[] args)
	{
		
		boolean result = List.of(21,54,85,32,14,32)
		
		.stream()
		.nonMatch((i)-> {return i>200;});
		
		System.out.println(result);
	}

}
