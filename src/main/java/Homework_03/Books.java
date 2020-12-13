package Homework_03;

import java.util.Scanner;

//Create a small application that mimics a library catalog.
// It needs to be able to add books, delete books and list books.
// Homework_03.Books are of two kinds: novels and art albums. They both have names and number of pages.
// Homework_03.Novels have type (like mystery, sf, etc.) while albums have paper quality.
//        Model these entities (book, novel, album) with different classes and inheritance.
public class Books {
    String name;
    int pageNr;

    public Books(String n, int p) {
        name = n;
        pageNr = p;
    }

    public static void main(String[] args) {
        System.out.println("What operation you want to do in this library?");
        System.out.println("1 - Print the list of books.");
        System.out.println("2 - Add a book to the library.");
        System.out.println("3 - Delete a book from library.");
        Scanner sc = new Scanner(System.in);
        int chose = sc.nextInt();
        switch (chose) {
            case 1:
                Functions.list();
                break;
            case 2:
                Functions.add();
                break;
            case 3:
                Functions.delete();
        }
    }
}

