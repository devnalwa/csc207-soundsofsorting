package edu.grinnell.sortingvisualizer.sortevents;


import java.util.List;
import java.util.ArrayList;
import edu.grinnell.sortingvisualizer.sorts.Sorts;

public class SwapEvent<T> implements SortEvent<T>{
    private int index1;
    private int index2;
    
    public SwapEvent (int a, int b){
        this.index1 = a;
        this.index2 = b;
    }
    public void apply(T[] arr){
       T temp = arr[index1];
       arr[index1] = arr[index2];
       arr[index2]= temp;
    }
    
    public List<Integer> getAffectedIndices(){
        List<Integer> lst = new ArrayList<>(); 
        lst.add(index1);
        lst.add(index2);
        return lst;
    }
    public boolean isEmphasized(){
        return true;
    }

}
