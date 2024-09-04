package shoppinglist.control;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import shoppinglist.model.List;
import shoppinglist.view.MainView;

public class MainViewController {
    
    private MainView view;
    
    public void actionAdd(String item){
        List.add(item);
        updateViewList();
    }
    
    public void actionDelete(int index){
        List.delete(index);
        updateViewList();
    }
    
    public void actionEdit(int index, String newText){
        List.edit(index, newText);
        updateViewList();
    }
    
    public void actionCheck(int index){
        List.check(index);
        updateViewList();
    }
    
    public void updateViewList(){
        
        JList list = view.getList();
        DefaultListModel<String> model = new DefaultListModel<>();
        for ( String item : List.toStringArrayList() ){
            model.addElement(item);
        }
        list.setModel(model);
    }
    
    public void setView(MainView view){
        this.view = view;
    }
}
