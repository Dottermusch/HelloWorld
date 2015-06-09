import java.util.Scanner;


public class HelloWorld 
{
	// Test comment to test GitHub
	public static void main(String[] args) 
	{
		/* TODO Auto-generated method stub
		 * Test of the comment - auto-asterisk capability of Eclipse
		 */
		// create a scanner object
		Scanner sc = new Scanner(System.in);
		
		// read a string
		System.out.print("Enter product code: ");
		String productCode = sc.next();
		
		// read a double value
		System.out.print("Enter price: ");
		double price = sc.nextDouble();
		
		// read an int value
		System.out.print("Enter quantity: ");
		int quantity = sc.nextInt();
		
		// perform a calculation and display the result
		double total = price * quantity;
		System.out.println();
		System.out.println(quantity + " " + productCode + " @ " + price + " = $" + String.format("%.2f", total));
		System.out.println();
		
		
		sc.close();
	}

}
