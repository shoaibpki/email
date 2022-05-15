package email;
import java.util.*;

public class emailClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Email for search in array : ");
		// input email for search
		String email = sc.next();
		sc.close();
		
		Stack<String> emails = new Stack<String>();

		// add email in the array
		emails.add("abc@hotmail.com");
		emails.add("xyz@gmail.com");
		emails.add("shoaib@live.com");
		emails.add("ijk@yahoo.com");
		
		if (emails.search(email.toLowerCase()) != -1) {// search user email in array if found
			System.out.println("Email found in the array list");
		} else {
			System.out.println("Email not found in the array list");
		}
		
	}
}
