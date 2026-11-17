package collection;

import java.util.ArrayList;

public class arr_1 {
	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("ketan");
		arr.add("ankush");
		arr.add("pravin");
		arr.add("avinash");
		arr.add("Nitesh");
		arr.add("aakash");
		
		System.out.println("This array size=>"+arr.size());
		
		System.out.println(arr.get(2));
		System.out.println(arr.getFirst());
		System.out.println(arr.getLast());
		
		System.out.println(arr.remove(4));      //Object Name
		System.out.println(arr);
		
		System.out.println(arr.remove("aakash"));    //output=True/False
		
		System.out.println(arr.contains("ankush"));  //output=True/False
		
		
	}

}
