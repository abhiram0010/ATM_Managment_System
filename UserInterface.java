package ATM;

import java.util.Scanner;

public class UserInterface {
	   private static int status;
   public static void main(String[]args) {
	   AtmOperationImpl imp1=new AtmOperationImpl();
	   Scanner sc=new Scanner(System.in);
	   int atmnumber=123456;
	   int  atmpin=123;
	   System.out.println("Enter The Atm Number");
	   int atmnum2=sc.nextInt();
	   System.out.println("Enter The Atm Pin");
	   int atmpin2=sc.nextInt();
	   if(atmnumber==atmnum2 && atmpin==atmpin2) {
		   while(true) {
		  System.out.println(" 1.ViewAvailableBalance\n 2.withdrawAmount\n 3.DepositAmount\n 4.ViewMiniStatement\n 5.Exit");
		   System.out.println("ENTER THE CHOICE");
			int ch=sc.nextInt();
		   if(ch==1) 
			imp1.viewBalance();  
		  else if(ch==2) {
			  System.out.println("Enter Amount to withdraw");
			  double withdraw=sc.nextDouble();
			   imp1.withdrawAmount(withdraw);
		  }
		  else if (ch==3) {
			  System.out.println("Enter Amount to deposit");
			  double deposit=sc.nextDouble();
			  imp1.depositAmount(deposit);
		  }
		  else if(ch==4) {
			  imp1.viewMiniStatement();
		  }
		  else if(ch==5) {
			  System.out.println("Collect your ATM card\n Thank You");
		  System.exit(status);
		  }
	   }
	   }
	   else {
		   System.out.println("Incorrect Atm number (or)Atm Pin");
	   }
   }
}
