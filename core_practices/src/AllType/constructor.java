package AllType;

public class constructor {

	public static void main(String[] args) 
	{
		Animal a = new Animal();
		Animal2 aa = new Animal2();
		Animal3 ani = new Animal3(65);
		
		
	}
}
  //1..Default 
class Animal   
{
	
}
     //2..Non-Parameterized 
class Animal2
{
	Animal2()
	{
		System.out.println("Non Parameterized");
	}
}
         //3..Parameterized
class Animal3
{
	int age;
	
	Animal3(int age)    //this.age = instance variable
	{
		this.age = age;  //age = Parameter
		System.out.println(age);
	}
}
  //Copy
class Animal4
{
	int death;
	Animal4(Animal4 a)
	{
		this.death = a.death;
		
	}
}