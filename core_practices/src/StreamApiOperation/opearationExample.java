package StreamApiOperation;

import java.util.List;

public class opearationExample {
	public static void main(String[] args) {
		
		List<Integer> list=List.of(11,22,63,74,85,96,75,44);
		
         list.stream()
		.filter((i)->{return i>50;})
		.forEach((i)-> {System.out.println(i);});
	}
}
