package edu.grinnell.sortingvisualizer.sortevents;

import java.util.List;
import java.util.ArrayList;

public class CompareEvent<T> implements SortEvent<T>{
    //fields
    private int index1;
    private int index2;
    //constructor
    public CompareEvent (int a, int b){
        this.index1 = a;
        this.index2 = b;
    }
    //apply takes an array but does nothing
    public void apply(T[] arr){
        
    }
    //getAffectedIndices takes no input returns a List containing
    //the indices of the affect array
    public List<Integer> getAffectedIndices(){
        List<Integer> lst = new ArrayList<>(); 
        lst.add(index1);
        lst.add(index2);
        return lst;
    }
    //isEmphasized takes no input, returns a boolean false
    public boolean isEmphasized(){
        return false;
    }

}
