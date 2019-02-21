import java.util.Scanner;
import java.io.*;
//แยกbag item แล้ว ข้อมูล ไม่reference กัน เลยทำให้อยู่ Class เดียวกัน
public class main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
  Novice m1 = new Novice();
  Item m2 = new Item();
  bag m3 = new bag();
  Farm m4 = new Farm();
	 int banned = 0;
	 int medkid = 0;
	 int Energy = 0;
        int choice = 0;


		m1.sex = "male";

		System.out.println("-------- Hello Novice !! ---------");
		System.out.println("--------- Play Game About -----------");
		System.out.println("!!!!!!!! Level UP 100 You Win !!!!!!!");
		System.out.println("!!!!!!!!  HP = 0 You Lost  !!!!!!!!");


      while ( m1.HP > 0 && m1.level < 100) {
    	  System.out.println("_________________________________");
            System.out.println("1. Farm");
            System.out.println("2. Watch bag");
            System.out.println("3. Use Item");
            System.out.print("Choice:");
        choice  = scanner.nextInt();
        
  
        
		 if(choice == 1){

				int choice1 = 0;
	        System.out.println("1. Hippocampus level+35 HP-15");
	        System.out.println("2. Golem level+16 HP-7");
	        System.out.println("3. Kong level+25 HP-11");
	        System.out.print("Choice:");
	        choice1  = scanner.nextInt();
	        if(choice1 == 1) {
	        	m1.level = m1.level + 35;
	        	m1.HP = m1.HP -15 ;
	            System.out.println("Level UP !! "+ m1.level);
	            System.out.println("HP = "+ m1.HP);

	        }
	        else if (choice1 == 2) {
	        	m1.level = m1.level + 16;
	        	m1.HP = m1.HP -7 ;
	            System.out.println("Level UP !! "+ m1.level);
	            System.out.println("HP = "+ m1.HP);

	        }
	        else if (choice1 == 3) {
	        	m1.level = m1.level + 25;
	        	m1.HP = m1.HP -11 ;
	            System.out.println("Level UP !! "+ m1.level);
	            System.out.println("HP = "+ m1.HP);

	        }

	            } 
	     else if (choice == 2){

				int choice3 = 0;
		        System.out.println("============Bag===============");
		        System.out.println("Use Item ");
		        System.out.println("1.Energy = "+ Energy);
		        System.out.println("2.Banned = "+ banned);
		        System.out.println("3.Medkid = "+ medkid);
		        System.out.print("Choice:");
		        choice3  = scanner.nextInt();
		        if (choice3 == 1) {
		        	m1.HP = m1.HP + 10;
		            System.out.println("Level UP !! "+ m1.level);
		            System.out.println("HP = "+ m1.HP);
		        }
		        else if (choice3 == 2) {
		        	m1.HP = m1.HP + 5; 
		            System.out.println("Level UP !! "+ m1.level);
		            System.out.println("HP = "+ m1.HP);
		        }
		        if (choice3 == 3) {
		        	m1.HP = m1.HP + 50;
		            System.out.println("Level UP !! "+ m1.level);
		            System.out.println("HP = "+ m1.HP);
		        }
		        System.out.println("============Bag==============="); 
	     } 	   
	     else if (choice == 3){
	 		int choice2 =0;
	         System.out.println("1. Energy Drink ");
	         System.out.println("2. Banned");
	         System.out.println("3. Medkit");
	         System.out.print("Choice:");
	         choice2  = scanner.nextInt();
	         if (choice2 == 1) {
	        	 Energy = Energy + 1;
	        	 
	         }
	         else if (choice2 == 2) {
	        	 banned = banned +1 ;
	        	 
	         }
	         else if (choice2 == 3) {
	        	 medkid = medkid +1 ;
	        	
	         }
	     } 
   	  System.out.println("_________________________________");
        }
       if (m1.level > 100 ) {
        System.out.println("=======================");
        System.out.println("You Win !! :) ");
 		System.out.println("HP = " + m1.HP);
 		System.out.println("Level  = 100 ");
 		System.out.println("Thank you For playing");
        System.out.println("=======================");
       }
       else if (m1.HP < 0) {
           System.out.println("=======================");
           System.out.println("You lost !! :( ");
    		System.out.println("HP = 0 ");
    		System.out.println("Thank you For playing");

           System.out.println("=======================");
    	   
       }
	}
}
