package com.company;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printArrayList(){
        System.out.println("You have " + groceryList.size() + " item in your grocery list");
        //loop through list to output all the elements in the list
        for (int i = 0; i < groceryList.size(); i++){
            System.out.println((i + 1) + "." + groceryList.get(i)) ;
        }
    }

    public void modifyList(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("item " + (position + 1) + " has been modified");
    }

    //method to remove item
    public void removeItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public String findItem(String searchItem){
        int position = groceryList.indexOf(searchItem);
        if (position >= 0){
            return searchItem;
        }
        return null;
    }
}
