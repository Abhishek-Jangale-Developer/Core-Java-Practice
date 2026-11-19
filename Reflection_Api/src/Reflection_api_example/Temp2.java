package Reflection_api_example;

public class Temp2 {
	
	public static void main(String[] args) {
		Student s = new Student();

        Class c = s.getClass();

        System.out.println("Class Name: " + c.getName());

        System.out.println("Methods:");

        java.lang.reflect.Method[] m = c.getDeclaredMethods();

        for (java.lang.reflect.Method method : m) {
            System.out.println(method.getName());
        }

        System.out.println("Variables:");

        java.lang.reflect.Field[] f = c.getDeclaredFields();

        for (java.lang.reflect.Field field : f) {
            System.out.println(field.getName());
        }
	}

}

class Student {
    int id = 101;
    String name = "Abhishek";

    void display() {
        System.out.println("Student Name: " + name);
    }
}
