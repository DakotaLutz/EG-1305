import java.util.Scanner;

public class TestPet {

	//begin main
	public static void main(String[] args) {
		
		//prep work
		Scanner input = new Scanner(System.in);
		
		Pet p = new Pet();
		
		String name;
		String type;
		int age;
		
		System.out.println("Please enter your pet's name");
		name = input.toString();
		
		System.out.println("Please enter your pet's type");
		type = input.toString();
		
		System.out.println("Please enter your pet's age");
		age = input.nextInt();

		System.out.println("Your pet's name is " + (p.getName()));
		System.out.println("Your pet's type is " + (p.getType()));
		System.out.println("Your pet's age is " + (p.getAge()));
		
	} //end main

}
