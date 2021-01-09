package Homework_04.ATM_Machine;

import java.util.Scanner;

public class bankAccount {
        private String accountNumber;
        private int amount;
        private final String currency;


        public bankAccount(String accountNumber, int amount, String currency) {
            this.accountNumber = accountNumber;
            this.amount = amount;
            this.currency = currency;

        }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void checkAmount(){
            System.out.println("Your balance is: " + amount+" "+currency);
        }
        public void addCash(){
            Scanner sc = new Scanner(System.in);
            System.out.println("What amount would you like to add?");
            int add = sc.nextInt();
            setAmount(amount+add);
//            amount = amount + add;
            System.out.println("The new balance is: " + amount +" "+currency);
        }
        public void withdrawCash(){
            Scanner sc = new Scanner(System.in);
            System.out.println("What amount would you like to withdraw?");
            int draw = sc.nextInt();
            amount = amount - draw;
            System.out.println("The new balance is: " + amount +" "+currency);
        }
}
