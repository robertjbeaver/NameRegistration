import java.util.Scanner;

public class NameRegistration {

	public static void main(String[] args) {
		// welcome user
		System.out.println("Student registration form   \n");
		
		Scanner scanMe = new Scanner(System.in);
		System.out.print("Enter First Name:   ");
        String firstName = scanMe.next(); 
        System.out.println("Enter Last Name:  ");
        String lastName = scanMe.next();
        System.out.println("Enter year of birth:   ");
        int birthYear = scanMe.nextInt();
        System.out.println("\nWelcome "+firstName+" "+lastName);
        System.out.println("Your registration is now complete. \nYour temporary password is: "+firstName+"*"+birthYear);
        scanMe.close();
	}

}
