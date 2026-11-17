package StreamApiOperation;

import java.util.ArrayList;
import java.util.List;

public class sortedExample2 {
	public static void main(String[] args) {
		
		List<Employesss> list = new ArrayList<Employesss>();
		
		list.add(new Employesss(1,"Pravin",233003));
		list.add(new Employesss(2,"pradip",2233334));
		list.add(new Employesss(3,"nitesh",500050));
		list.add(new Employesss(4,"aakash",458500050));
		
		System.out.println(list);
		
		list.stream()
		
		//Comparator
		.sorted((o1,o2)->{return Double.compare(o2.salary,o1.salary);})
		.limit(2)
		.skip(1)
        .forEach((i)->{System.out.println(i);});
     
			}
}

class Employesss
{
	int emp_id;
	String emp_name;
    int salary;
    
    public Employesss(int emp_id,String emp_name,int salary)
    {
    	super();
    	this.emp_id = emp_id;
    	this.emp_name = emp_name;
    	this.salary = salary;
    }
    
    public String toString()
    {
		return "emp_name"+emp_name + "emp_id"+emp_id+ "salary"+salary;
    	
    }

}


