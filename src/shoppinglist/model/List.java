package shoppinglist.model;

import java.util.ArrayList;
import shoppinglist.model.Item;

public class List {

    private static ArrayList<Item> list = new ArrayList<>();
    
    public static void add(String item){
        
        list.add(new Item(item));
    }
    
    public static void delete(int index){
        
        list.remove(index);
    }
    
    public static void edit(int index, String item){
        
        list.remove(index);
        list.add(index, new Item(item));
    }
    
    public static void check(int index){
        
        list.get(index).toggleCheck();
    }
    
    public static ArrayList<String> toStringArrayList(){
        ArrayList<String> array = new ArrayList<>();
        for (Item item : list){
            array.add(item.toString());
        }
        return array;
    }
}
