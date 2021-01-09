package Homework_04.ATM_Machine;

public class user {

    private card card1;

    public user(card card1) {
        this.card1 = card1;
    }
    public void withdraw(){
        card1.draw();
    }
    public void add(){
        card1.addCash();
    }
    public void interogateBalance(){
        card1.checkAmount();
    }
    public void checkPin(){
        card1.checkPin();
    }
    public void changePin(){
        card1.changePin();
    }

}
