import java.util.Scanner;

public class VendingMachineProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numDrinks;
      int numRestock;
      
      numDrinks = scnr.nextInt();
      numRestock = scnr.nextInt();
      
      VendingMachine newVendingMachine = new VendingMachine();

      newVendingMachine.purchase(numDrinks);
      newVendingMachine.restock(numRestock);
      newVendingMachine.report();
   }
}
