package core_practices;

public class temp4 {

	    public static void main(String[] args) {

	        Student first = new Student();

	        first.name = "pravin";
	        first.age = 22;
	        first.branch = "Computer Science";
	        first.city = "Pune";

	        first.study();

	        Student second = new Student();

	        second.name = "Pravina";
	        second.age = 19;
	        second.branch = "Information Technology";
	        second.city = "Mumbai";

	        second.play();

	        System.out.println(Student.college);
	        System.out.println(first.college);

	        first.college = "Modern College";

	        System.out.println(second.college);
	        System.out.println(Student.college);
	        System.out.println(first.college);

	        first.details();
	        second.details();
	    }
	}

	class Student {

	    static String college = "SPPU";

	    String name;
	    int age;
	    String branch;
	    String city;

	    public void study() {
	        System.out.println(name + " is studying.");
	    }

	    public void play() {
	        System.out.println(name + " is playing.");
	    }

	    public void details() {
	        System.out.println("Name   : " + name);
	        System.out.println("Age    : " + age);
	        System.out.println("Branch : " + branch);
	        System.out.println("City   : " + city);
	        System.out.println("College: " + college);
	        System.out.println();
	    }
	}
