/** A cash register */
public class CashRegister
{
  /** Constructs a cash register
  */
  public CashRegister()
  {
    purchase = 0;
    payment = 0;
  }
  /** Records the sale of an item
  */
  public void recordPurchase(int id)
  {
    double total;
    switch (id) {
      case 1:
        total = purchase + productPrice[0];
        purchase = total;
        productPurchased[0] += 1;
        break;
      case 2:
        total = purchase + productPrice[1];
        purchase = total;
        productPurchased[1] += 1;
        break;
      case 3:
        total = purchase + productPrice[2];
        purchase = total;
        productPurchased[2] += 1;
        break;
      case 4:
        total = purchase + productPrice[3];
        purchase = total;
        productPurchased[3] += 1;
        break;
      case 5:
        total = purchase + productPrice[4];
        purchase = total;
        productPurchased[4] += 1;
        break;
      case 6:
        total = purchase + productPrice[5];
        purchase = total;
        productPurchased[5] += 1;
        break;
    }
  }
  /** Enters the payment received
  */
  public void enterPayment(double amount)
  {
    payment = amount;
    System.out.println("You gave : " + payment);
  }
  /** Computes the change due and resets
  */
  public double giveChange()
  {
    double change = payment - purchase;
    purchase = 0;
    payment = 0;
    return change;
  }
  /** Print the receipt and the change
  */
  public void finalReceipt()
  {
    System.out.println("Here is your final receipt :");
    int i;
    for (i = 0; i < productPurchased.length; i++) {
      if (productPurchased[i] > 0) {
        System.out.println("Product name : " + productName[i] + " Quantity : " + productPurchased[i]);
      }
    }
    System.out.println("Total Cost : " + purchase);
  }
  /** Reads the prooducts 
  */
  public void readProducts()
  {
    int i;
    for (i = 0; i < productName.length; i++) {
      System.out.println("ID : " + productID[i] + " | Name : " + productName[i] + " | Price = " + productPrice[i]);
    }
  }
  /** Declare the variables
  */
  public double purchase;
  private double payment;
  private int[] productID = {1, 2, 3, 4, 5, 6};
  private String[] productName = {"Milk", "Yogurt", "Sandwich", "Pizza", "Soda", "Biscuits"};
  private double[] productPrice = {1.25, 0.76, 2.12, 12.89 , 0.75, 1.90}; 
  private int[] productPurchased = {0, 0, 0, 0, 0, 0};
}
