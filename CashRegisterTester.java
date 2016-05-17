/* Import library for Scanner class */
import java.util.*;

public class CashRegisterTester
{
  public static void main(String[] args) {
  	/* We create an instance */
    CashRegister register = new CashRegister();
    Scanner scan = new Scanner(System.in);

    /* We print the products */
    register.readProducts();

    /* Declare the boolean */
    boolean check = false;

    while (check == false) {
    	/* We print the menu */
    	System.out.println("\nWhat would you like to do ?\n1. Purchase product\n2. Pay\n3. Exit\n");
    	int userInput = scan.nextInt();
    	
    	if (userInput == 1) {
            System.out.println("Enter the ID of the product that you would like to add :");
            int userAddProduct = scan.nextInt();
    		register.recordPurchase(userAddProduct);
    	} else if (userInput == 2) {
            register.finalReceipt();
            System.out.println("Enter the payment amount :");
            double userPayment = scan.nextDouble();
    		register.enterPayment(userPayment);
            if (userPayment >= register.purchase) {
                double change = register.giveChange();
                System.out.println("Your change is : " + change);
                System.exit(0);
            } else {
                System.out.println("The total cost is greater than the amount you gave. Try again ! ");
            }
    	} else if (userInput == 3) {
            System.out.println("Bye bye !");
    		check = true;
    	} else {
    		System.out.println("Wrong input ! Try again.");
    	}
    }
  }
}
