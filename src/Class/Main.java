package Class;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BookList library = new BookList();
        Scanner input = new Scanner(System.in);

        System.out.println("======== WELCOME TO YOUR LIBRARY ========\n");
        System.out.println("You wish? press!");
        System.out.println(">(1) Register a new book");
        System.out.println(">(2) Search for a book");
        System.out.println(">(3) Show all books");
        System.out.println(">(4) Remove a book");
        System.out.println(">(5) Exit");

        int option = input.nextInt();

        while(option != 5){
            switch (option){
                case 1:
                    library.addBook();
                    break;
                case 2:
                    library.searchBook();
                    break;
                case 3:
                    library.showAllBooks();
                    break;
                case 4:
                    library.removeBook();
            }
            menu(option);
            option = input.nextInt();
        }
    }

    public static int menu(int option){

        Scanner input = new Scanner(System.in);
        System.out.println("\nYou wish? press!");
        System.out.println(">(1) Register a new book");
        System.out.println(">(2) Search for a book");
        System.out.println(">(3) Show all books");
        System.out.println(">(4) Remove a book");
        System.out.println(">(5) Exit");
        return option;
    }

}