import java.util.Scanner;

public class Item {

	 public static  void item (int b1, int b2 ,int b3) {
			Scanner scanner = new Scanner(System.in);
		int choice2 =0;
         System.out.println("1. Energy Drink ");
         System.out.println("2. Banned");
         System.out.println("3. Medkit");
         System.out.print("Choice:");
         choice2  = scanner.nextInt();
         if (choice2 == 1) {
        	 b2 = b2 + 1;
        	 
         }
         else if (choice2 == 2) {
        	 b1 = b1 +1 ;
        	 
         }
         else if (choice2 == 3) {
        	 b3 = b3 +1 ;
        	
         }
   
 
	 }
}
