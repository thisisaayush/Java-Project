//Demonstrates the use of Arraylist concepts.
package GroceryList1;

import java.util.Scanner;

public class MainGrocery {
    private static Scanner scanner = new Scanner( System.in );//Provides access level to all methods in a class.
    private static GroceryList groceryList = new GroceryList();//Provides access level to all methods in a class.

    public static void main(String[] args) {
        int choice = 0;
        boolean quit = false;

        printInstruction();

        while (!quit) {
            System.out.println( "Enter you choice:" );
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstruction();//When user input 0, printInstruction is invoked. Similarly, respective method below is invoked with respective int input.
                    break;
                case 1:
                    addItem();
                    break;
                case 2:
                    printItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }
    //printInstruction() method is for user. It gives instruction on how to add, print, modify, remove grocery items for
    //the list.
      public static void printInstruction(){
          System.out.println("\nPress ");
          System.out.println("\t 0 - To print choice options.");
          System.out.println("\t 1 - To add item to the grocery list.");
          System.out.println("\t 2 - To print items of the grocery list.");
          System.out.println("\t 3 - To modify an item in the grocery list.");
          System.out.println("\t 4 - To remove an item from the grocery list.");
          System.out.println("\t 5 - To search for an item in the grocery list.");
          System.out.println("\t 6 - To quit the application.");
        }

        public static void addItem(){
            System.out.println("Enter grocery item:");
            String item = scanner.nextLine();
            groceryList.addGroceryList( item );
        }

        public static void printItem(){
            groceryList.printGroceryList();
        }

        public static void modifyItem(){
            System.out.println("Enter old grocery item:");
            String oldItem = scanner.nextLine();
            System.out.println("Enter new grocery item:");
            String newItem = scanner.nextLine();
            groceryList.modifyGroceryList( oldItem,newItem );
        }

        public static void removeItem(){
            System.out.println("Enter item's position:");
            groceryList.removeGroceryItem( scanner.nextInt() );
        }

        public static void searchItem(){
            System.out.println("Enter item name:");
            groceryList.searchItem( scanner.nextLine() );
        }

    }


