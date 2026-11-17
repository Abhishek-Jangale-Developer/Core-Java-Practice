package StreamApiOperation;

import java.util.ArrayList;
import java.util.List;

public class sortedExample {
	public static void main(String[] args) {
			
			List<Employess> list = new ArrayList<Employess>();
			
			list.add(new Employess(1,"Pravin",233003));
			list.add(new Employess(2,"pradip",2233334));
			list.add(new Employess(3,"nitesh",500050));
			
			System.out.println(list);
			
			list.stream()
			
			.sorted((o1,o2)->{return Double.compare(o2.salary,o1.salary);})
            .forEach((i)->{System.out.println(i);});
             
			
		}

	}

	class Employess
	{
		int emp_id;
		String emp_name;
	    int salary;
	    
	    public Employess(int emp_id,String emp_name,int salary)
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


