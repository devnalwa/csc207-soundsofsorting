package edu.grinnell.sortingvisualizer.sortevents;

import java.util.ArrayList;
import java.util.List;

public class CopyEvent<T> implements SortEvent<T> {
    private T val;
    private int index;
    
    public CopyEvent (T val, int index){
        this.val = val;
        this.index = index;
    }
    
    public void apply(T[] arr){
        arr[index] = val;
    }
    
    public List<Integer> getAffectedIndices(){
        List<Integer> lst = new ArrayList<>(); 
        lst.add(index);
        return lst;
    }
    public boolean isEmphasized(){
        return true;
    }
}
