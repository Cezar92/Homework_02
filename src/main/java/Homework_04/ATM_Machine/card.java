package Homework_04.ATM_Machine;

import java.util.Scanner;

public class card {
    private final bankAccount account1;
    String pin1;

    public card(bankAccount account1, String pin1) {
        this.account1 = account1;
        this.pin1 = pin1;
    }

    public String getPin1() {
        return pin1;
    }

    public void draw(){
        account1.withdrawCash();
    }

    public void addCash(){
        account1.addCash();
    }

    public void checkAmount(){
        account1.checkAmount();
    }

    public void checkPin() {
        Scanner keyboard = new Scanner(System.in);
        int incercari=1;

//        System.out.println("WELCOME TO THE BANK OF MITCHELL.");
        System.out.print("ENTER YOUR PIN: ");
        String entry = keyboard.next();

        while (!entry.equals(pin1) && incercari !=3) {

            System.out.println("INCORRECT PIN. TRY AGAIN.");
            System.out.print("ENTER YOUR PIN: ");
            entry = keyboard.next();
            incercari++;

        } if (!entry.equals(pin1)){
            System.out.println("INCORRECT PIN.");
            System.out.print("No more attempts ");
        } else {
            System.out.println("PIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
        }
    }
    public void changePin(){
        System.out.println("Type your new PIN: ");
        Scanner sc = new Scanner(System.in);
        String pin2 = sc.next();
        pin1 = pin2;
        System.out.println("new pin is " + pin1);
    }
}
