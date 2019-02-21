import java.util.Scanner;
public class Farm {

	 public static void Fight (int m1,int m2) {
			Scanner scanner = new Scanner(System.in);
			int choice1 = 0;
        System.out.println("1. Hippocampus level+35 HP-15");
        System.out.println("2. Golem level+16 HP-7");
        System.out.println("3. Kong level+25 HP-11");
        System.out.print("Choice:");
        choice1  = scanner.nextInt();
        if(choice1 == 1) {
        	m2 = m2 + 35;
        	m1 = m1 -15 ;
            System.out.println("Level UP !! "+ m2);
            System.out.println("HP = "+ m1);

        }
        else if (choice1 == 2) {
        	m2 = m2 + 16;
        	m1 = m1 -7 ;
            System.out.println("Level UP !! "+ m2);
            System.out.println("HP = "+ m1);

        }
        else if (choice1 == 3) {
        	m2 = m2 + 25;
        	m1 = m1 -11 ;
            System.out.println("Level UP !! "+ m2);
            System.out.println("HP = "+ m1);

        }

    }
	 
}
