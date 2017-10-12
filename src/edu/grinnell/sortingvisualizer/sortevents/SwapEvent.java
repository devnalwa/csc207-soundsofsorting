package edu.grinnell.sortingvisualizer.sortevents;


import java.util.List;
import java.util.ArrayList;
import edu.grinnell.sortingvisualizer.sorts.Sorts;
import edu.grinnell.sortingvisualizer.*;

public class SwapEvent<T> implements SortEvent<T>{
    //field
    private int index1;
    private int index2;
    //constructor
    public SwapEvent (int a, int b){
        this.index1 = a;
        this.index2 = b;
    }
    //apply takes an array as input, returns nothing
    // and swaps the values at the two indices.
    public void apply(T[] arr){
       T temp = arr[index1];
       arr[index1] = arr[index2];
       arr[index2]= temp;
    }
    //getAffectedIndices takes no input, returns a list
    //of the indexed get affected.
    public List<Integer> getAffectedIndices(){
        List<Integer> lst = new ArrayList<>(); 
        lst.add(index1);
        lst.add(index2);
        return lst;
    }
    //isEmphasized takes no input, returns boolean value true; 
    public boolean isEmphasized(){
        return true;
    }

}
