package edu.grinnell.sortingvisualizer.sortevents;

import java.util.List;
import java.util.ArrayList;

public class CompareEvent<T> implements SortEvent<T>{
    private int index1;
    private int index2;
    
    public CompareEvent (int a, int b){
        this.index1 = a;
        this.index2 = b;
    }
    public void apply(T[] arr){
        
    }
    
    public List<Integer> getAffectedIndices(){
        List<Integer> lst = new ArrayList<>(); 
        lst.add(index1);
        lst.add(index2);
        return lst;
    }
    public boolean isEmphasized(){
        return false;
    }

}
