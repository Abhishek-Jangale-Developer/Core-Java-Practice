package Reflection_api_example;

public class temp3 {
	
	public static void main(String[] args) {




        Studentss s = new Studentss();

        Class<? extends Studentss> c = s.getClass();

        System.out.println(c.getName());
    }


	}


class Studentss {
    
}

