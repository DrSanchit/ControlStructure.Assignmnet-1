import java.util.Scanner;

public class InputAge {
	
	

	public static void main(String[] args) {
		Scanner	s = new Scanner(System.in);
		
	int age;
	System.out.print("Please enter your Age..");
	age = s.nextInt();
	System.out.println("Your age is =" +age);
	
	//If else loops
	
	if (age>90)
	
	System.out.println("Age entered is invalid");
	
	else if (age<18)
		System.out.println("Not Eligible to Vote");
	else
			System.out.println("You are eligible to caste Vote");
			
			s.close();
			
	}
	
	}


