package StringApi;

public class Collectors_example {
	public static void main(String[] args) {
		
		List<Employee> list = List.of(new Employee(1,"john","hr"),List.of(new Employee(1,"john","hr")));
		
		System.out.println(list);
		
		Map<String,List<Employee>> mp = list.stream() .collect()
	}

}
