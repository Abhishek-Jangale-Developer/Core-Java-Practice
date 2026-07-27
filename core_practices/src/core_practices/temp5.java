package core_practices;

public class temp5 {
	public static void main (String args[])
	{

		        Employee first = new Employee();

		        first.empId = 101;
		        first.name = "Akash";
		        first.salary = 35000;
		        first.department = "IT";

		        first.work();

		        Employee second = new Employee();

		        second.empId = 102;
		        second.name = "Arya";
		        second.salary = 40000;
		        second.department = "HR";

		        second.attendMeeting();

		        System.out.println(Employee.company);
		        System.out.println(first.company);

		        first.company = "Google";

		        System.out.println(second.company);
		        System.out.println(Employee.company);
		        System.out.println(first.company);

		        first.display();
		        second.display();
		    }
		}

		class Employee {

		    static String company = "TCS";

		    int empId;
		    String name;
		    double salary;
		    String department;

		    public void work() {
		        System.out.println(name + " is working.");
		    }

		    public void attendMeeting() {
		        System.out.println(name + " is attending a meeting.");
		    }

		    public void display() {
		        System.out.println("Employee ID : " + empId);
		        System.out.println("Name        : " + name);
		        System.out.println("Salary      : " + salary);
		        System.out.println("Department  : " + department);
		        System.out.println("Company     : " + company);
		        System.out.println();
		    }
		}