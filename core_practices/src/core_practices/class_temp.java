package core_practices;

public class class_temp {
	public static void main (String args[])
	{
		Animal ani = new Animal();
		
		ani.eat();
		
	}

}

//Parent class
class Animal {
 void eat() {
     System.out.println("Animal is eating");
 }
}

//Child class 1
class Dog extends Animal {
 void bark() {
     System.out.println("Dog is barking");
 }
}

//Child class 2
class Cat extends Animal {
 void meow() {
     System.out.println("Cat is meowing");
 }
}
