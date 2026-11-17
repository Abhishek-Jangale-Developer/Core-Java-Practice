package StreamApiOperation;

import java.util.ArrayList;
import java.util.List;
public class foreachExample {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(21);
		list.add(78);
		list.add(45);
		list.add(22);
		list.add(212);
		
		list.stream()
		.filter((i)->{return i%2==0;})
		.forEach(())
	}

}
