package Oops.OopsConcept;
/* class  object and constructor
class Pen {
	   String color;
	  
	   public void printColor() {
	       System.out.println("The color of this Pen is " + color);
	   }
	}
	 
public class Oops{
	
    public static void main(String args[]) {
	      Pen p1 = new Pen();
	      p1.color= "blue";
	 
	      Pen p2 = new Pen();
	      p2.color = "black";
	 
	      Pen p3 = new Pen();
	      p3.color = "red";
	 
	      p1.printColor();
	      p2.printColor();
	      p3.printColor();
	   }
	} 
Polymorphism */ 
class Student {
	   String name;
	   int age;
	  
	   public void displayInfo(String name) {
	       System.out.println(name);
	   }
	 
	   public void displayInfo(int age) {
	       System.out.println("age is " +age);
	   }
	 
	   public void displayInfo(String name, int age) {
	       System.out.println(name);
	       System.out.println(age);
	   }
	}
class Kids extends Student{
	
	public void displayInfo(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println(name + " age is " + age);
	}
	
}
public class Oops {
	   public static void main(String args[]) {
		   Kids s1 = new Kids();
		   Student s2 = s1 ;
		   s2.displayInfo("Mohan", 21);
		   s2.displayInfo(10);
	   }

	   }


