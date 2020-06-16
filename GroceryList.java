package GroceryList1;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();/*ArrayList will be accessed by any methods in
    GroceryList class.*/

    //addGroceryList() method will help add items in grocery list.
    public void addGroceryList(String addItem){
        groceryList.add( addItem );
    }
    //printGroceryList() method will help to print all items in a grocery list.
    public void printGroceryList(){
        for(int i = 0 ; i < groceryList.size() ; i++){
            int x = i + 1;
            System.out.println("Item " + x + " is " + groceryList.get( i ));
        }
    }
    //modifyGroceryList() method will help to place new item in a place of old item. It will delete old item
    //in a grocery list.
    public void modifyGroceryList(String oldItem, String newItem){
        int positionOfOldItem = groceryList.indexOf( oldItem );
        groceryList.set( positionOfOldItem,newItem );
        System.out.println("New item " + newItem + " is added in place of old item " + oldItem + ".");
    }
    //removeGroceryItem() method will remove the item of a given position.
    public void removeGroceryItem(int position){
        System.out.println(groceryList.get(position - 1) + " is removed.");
        groceryList.remove( position );
    }

    public void searchItem(String item){
        int position = groceryList.indexOf( item );
        System.out.println("Item is at position " + position + 1 + ".");
    }
}
