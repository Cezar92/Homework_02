package Homework_04.ATM_Machine;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        bankAccount bankAccount1 = new bankAccount("123456", 2000, "RON");
        card card1 = new card(bankAccount1, "1234");
        user user1 = new user(card1);

        bankAccount bankAccount2 = new bankAccount("234567", 3000, "EURO");
        card card2 = new card(bankAccount2, "0000");
        user user2 = new user(card2);

        bankAccount bankAccount3 = new bankAccount("345678", 4000, "$");
        card card3 = new card(bankAccount3, "1122");
        user user3 = new user(card3);

        user userBlank = new user(null);

        System.out.println("What card do you want to use? 1-Silver. 2-Gold. 3-Platinium");
        Scanner sc = new Scanner(System.in);
        int option1 = sc.nextInt();
        switch (option1) {
            case 1:
                userBlank = user1;
                userBlank.checkPin();
                break;
            case 2:
                userBlank = user2;
                userBlank.checkPin();
                break;
            case 3:
                userBlank = user3;
                userBlank.checkPin();
                break;
        }
        while (userBlank != null ) {
            System.out.println("What operation would you like to do? 1- Check Amount. 2- Add Cash. 3- Draw. 4- Change PIN. 5- Exit.");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    userBlank.interogateBalance();
                    break;
                case 2:
                    userBlank.add();
                    break;
                case 3:
                    userBlank.withdraw();
                    break;
                case 4:
                    userBlank.changePin();
                    break;
                case 5:
                    userBlank = null;

            }
        }

    }
}