package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class BookList {

    Scanner input = new Scanner(System.in);

    ArrayList<String> bookList = new ArrayList<String>();
    ArrayList<String> authorList = new ArrayList<String>();
    ArrayList<Integer> numPageList = new ArrayList<Integer>();

    public void addBook(){
        System.out.println("To register a new book, enter information:\n");


        System.out.println("Enter the title:");
        bookList.add(input.nextLine());

        System.out.println("Enter the Author:");
        authorList.add(input.nextLine());

        System.out.println("Enter the number of pages:");
        numPageList.add(input.nextInt());
        input.nextLine();

        System.out.println("OK! Registration completed");

    }

    public void showAllBooks(){
        System.out.println("Complete list of books!\n");

        for(int index = 0; index < bookList.size(); index++){

            System.out.println( index + 1 + " " + bookList.get(index) + " [" + authorList.get(index) +
                    "/" + numPageList.get(index) + "]");
        }
    }

    public void searchBook(){
        System.out.println("Enter the book you want to find:");
        String book = input.nextLine();

        for(int i = 0; i < bookList.size(); i++){

            if(book.equals(bookList.get(i))){
                System.out.println("Book found on our list: " + book);
                System.out.println( i + 1 + " " + bookList.get(i) + " [" + authorList.get(i) +
                        "/" + numPageList.get(i) + "]");
                return;
            }
        }
    }

    public void removeBook(){
        System.out.println("Enter the book you want to remove?:");
        String book = input.nextLine();

        for(int i = 0; i < bookList.size(); i++){

            if(book.equals(bookList.get(i))){
                bookList.remove(i);
                authorList.remove(i);
                numPageList.remove(i);
                System.out.println("OK, book removed successfully!");
            }
        }

    }
}
