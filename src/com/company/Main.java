package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        double balance = 1000.00; //Initial balance
        System.out.println("******* ATM INTERFACE *******");
        System.out.println("Welcome! Your balance is: $" + balance );

        while (true) {
            //Display Option
            System.out.println("\n Please choose a valid option");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. QUIT");
            System.out.println("Enter your choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1: //for withdraw
                    System.out.println("enter amount to withdraw Rs.");
                    double amountWithdraw = sc.nextDouble();
                    if (amountWithdraw <= balance ) {
                        balance -= amountWithdraw;
                        System.out.println("Transaction Sucessful! Your new balance is : Rs." + balance);
                    }
                    else {
                        System.out.println("Transaction failed! Insufficient balance.");
                    }
                    break;
                case 2: //Deposit
                    System.out.println("Enter amount to deposit: $");
                    double amountDeposit = sc.nextDouble();
                    balance += amountDeposit;
                    System.out.println("Transaction successful! Your new balance is: Rs." + balance);
                    break;
                case 3: //Check Balance
                    System.out.println("Your current balance is: Rs." + balance);
                    break;
                case 4: //QUIT
                    System.out.println("Thankyou for using our ATM interface!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again for using the interface.");
                    break;
            }
        }
    }
}
