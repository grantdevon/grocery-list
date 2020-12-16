package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
	// write your code here
        boolean quit = false;
        int choice = 0;
        printInstructions();

        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;

                case 1:
                    groceryList.printArrayList();
                    break;

                case 2:
                    addItem();
                    break;

                case 3:
                    modifyItem();
                    break;

                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }

        }
    }

    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 -  To print choice options");
        System.out.println("\t 1 - To print the list of grocery items");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify an Item in the list");
        System.out.println("\t 4 - To remove an item in the list");
        System.out.println("\t 5 - To search for an Item");
        System.out.println("\t 6 - To quit");
    }

    public static void addItem(){
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Enter item number: ");
        int itemNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the new item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyList((itemNumber - 1) , newItem);
    }

    public static void removeItem(){
        System.out.print("Enter item number: ");
        int itemNumber = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeItem(itemNumber-1);
    }

    public static void searchForItem(){
        System.out.println("Please enter the name of the item: ");
        String itemToSearchFor = scanner.nextLine();
        if (groceryList.findItem(itemToSearchFor) != null){
            System.out.println("Found " + itemToSearchFor + " in our grocery list");
        }
        else {
            System.out.println(itemToSearchFor + " Is not in the shopping list");
        }
    }
}
