package shoppinglist.model;

public class Item {
    
    private String name;
    private boolean checked;
    
    public Item(String name) {
        this.name = name;
    }
    
    public void toggleCheck(){
        checked = !checked;
    }
    
    @Override
    public String toString(){
        String string = "";
        if (checked) string += "☑ ";
        string += name;
        return string;
    }
}
