package edu.grinnell.sortingvisualizer.sortevents;

import java.util.ArrayList;
import java.util.List;

public class CopyEvent<T> implements SortEvent<T> {
    //field
    private T val;
    private int index;
    //constructor
    public CopyEvent (T val, int index){
        this.val = val;
        this.index = index;
    }
    //apply takes an array, and assign the val into 
    //the array at position index.
    public void apply(T[] arr){
        arr[index] = val;
    }
    //getAffectedIndices takes no input, returns a list
    //of the index of the affected index.
    public List<Integer> getAffectedIndices(){
        List<Integer> lst = new ArrayList<>(); 
        lst.add(index);
        return lst;
    }
    //isEmphasized takes no input, returns boolean value
    //true.
    public boolean isEmphasized(){
        return true;
    }
}
