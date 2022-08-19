package firstAssignment;

// Write a program to demonstrate the functionalities of static keyword.
// Static variable
// Static method
// Static block
//Static Nested class

	
	 class Students{
		String name ;
		int rollno;
		static String collegeName = " Anna University";
		static int counter = 0;
		
		Students(String name){
			counter++;
			this.name = name ;
			this.rollno=counter;
		}
		
		public void showDetails() {
			System.out.println(name+" "+rollno+" "+collegeName);
		}
		
		static void change() {
			collegeName = " Meenkashi College";
		}
	}
	 
	class Calculate{
		static void sqaureArea(int size) {
			System.out.println(size*size);
		}
	}
	public class Question_8 {
		
		// Static block execute before main
		
		static{
			System.out.println("this is Static block");
			System.out.println("This program demonstrate functionalities of static keyword ");
			}
		
	 public class Animal{
		 static String animalName = "LION";
		 
		 public static class WildAnimal{
			 public void displayAnimal() {
				 System.out.println(animalName +" is wild animal");
			 }
			 
		 }
		 	
	 }
		
		
	public static void main(String[] args) {
		
		// Static variable - common property to all objects like college name is common for all students
		// will get memory only once and retain its value 
		System.out.println();
		System.out.println("Static Variable Example");
		Students s1 = new Students("ABC");
		Students s2 = new Students("DEF");
		Students s3 = new Students("GHI");
		
		s1.showDetails();
		s2.showDetails();
		s3.showDetails();
		System.out.println();
		
		
		System.out.println("Static Method Example ");
		//Static method - changes the value of Static varibale 
		Students s4 = new Students("JKL");
		s4.change();
		s4.showDetails();
		System.out.println();
		//Static method - without creating a object , method can be used 
		Calculate.sqaureArea(5);
		
		
		System.out.println("Static Nexted Class");
		// Static Nexted Class - we can create  object and then call method 
		Animal.WildAnimal a1 = new Animal.WildAnimal();
		a1.displayAnimal();
		
		
	}

}
