package edu.grinnell.sortingvisualizer.sorts;

import java.util.ArrayList;
import java.util.List;

import edu.grinnell.sortingvisualizer.sortevents.*;

public class Sorts {
    public static <T extends Comparable<T>> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static <T extends Comparable<T>> List<SortEvent<T>> selectionSort(T[] arr) {
        List<SortEvent<T>> ls = new ArrayList<SortEvent<T>>();
        for (int i = 0; i < arr.length - 1; i++) {
            int lowestIndex = i;
            for (int j = i; j < arr.length; j++) {
                ls.add(new CompareEvent(j, lowestIndex));
                if (arr[j].compareTo(arr[lowestIndex]) < 0) {
                    lowestIndex = j;
                }
            }
            ls.add(new SwapEvent(i, lowestIndex));
            swap(arr, i , lowestIndex);
            
        }
        return ls;
    }

    public static <T extends Comparable<T>> List<SortEvent<T>> insertionSort(T[] arr) {
        List<SortEvent<T>> ls = new ArrayList<SortEvent<T>>();
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                ls.add(new CompareEvent(j-1, j));
                if (arr[j-1].compareTo(arr[j]) > 0) {
                    ls.add(new SwapEvent(j-1, j));
                    swap(arr, j, j-1);
                }
            }
        }
        return ls;
    }

    public static <T extends Comparable<T>> List<SortEvent<T>>  mergeSort(T[] arr) {
        return mergeSort(arr, 0, arr.length);
    }
    
    public static <T extends Comparable<T>> List<SortEvent<T>> mergeSort(T[] arr, int low, int high) {
        List<SortEvent<T>> ls = new ArrayList<SortEvent<T>>();
        if(high - low > 1){
            Object[] res = new Object[high - low];
            int secondhalf = low + ((high - low) / 2);  
            mergeSort(arr, low, secondhalf);
            mergeSort(arr, secondhalf, high);
            int pos1 = 0;
            int pos2 = 0;
            int pos = 0;
            while(pos1 < secondhalf - low && pos2 < high - secondhalf){
                ls.add(new CompareEvent(pos1 + low, secondhalf + pos2));
                if(arr[pos1 + low].compareTo(arr[secondhalf +pos2]) <= 0){
                    res[pos]=arr[low + pos1];
                    pos1++;
                    pos++;
                }else{
                    res[pos] = arr[pos2 + secondhalf];
                    pos2++;
                    pos++;
                }
            }
            if(pos1 == secondhalf - low){
                while(pos2 < high - secondhalf){
                    res[pos] = arr[pos2 + secondhalf];
                    pos2++;
                    pos++;
                }
            }else{
                while(pos1 < secondhalf - low){
                    res[pos]=arr[low + pos1];
                    pos1++;
                    pos++;
                }
            }
            for(int i = low; i < high; i++){
                ls.add(new CopyEvent(res[i - low], i));
                arr[i] = (T) res[i - low];
            }
            
        }
        return ls;
    }

    //low = 0; high = arr.length 
    public static <T extends Comparable<T>> List<SortEvent<T>>  quickSort(T[] arr) {
        return quickSort(arr, 0, arr.length);
    }
    
    public static <T extends Comparable<T>> List<SortEvent<T>>  quickSort(T[] arr, int low, int high) {
        List<SortEvent<T>> ls = new ArrayList<SortEvent<T>>();
        if(high - low > 1){
            int mid = (high - low)/2 + low; 
            T val = arr[mid]; 
            ls.add(new SwapEvent(mid, high-1));
            swap(arr, mid, high - 1); 
            int fin1 = low;
            int fin2 = high - 2;
            while(fin1 != fin2){
                while(fin1 != fin2 && arr[fin1].compareTo(val) < 0){
                    ls.add(new CompareEvent(fin1,mid));
                    fin1++;
                }
                ls.add(new CompareEvent(fin1, mid));
                while(fin1 != fin2 && arr[fin2].compareTo(val) > 0){
                    ls.add(new CompareEvent(fin2, mid));
                    fin2--;
                }
                ls.add(new CompareEvent(fin2, mid));
                //if(arr[fin1].compareTo(val)> 0 && arr[fin2].compareTo(val) < 0){
                  //  ls.add(new CompareEvent(fin1, mid));
                   // ls.add(new CompareEvent(fin2, mid));
                    ls.add(new SwapEvent(fin1, fin2));
                    swap(arr, fin1, fin2);
                //}
                //ls.add(new CompareEvent(fin1, mid));
                //ls.add(new CompareEvent(fin2, mid));
            }
           
            if(arr[fin1].compareTo(val)< 0){
                ls.add(new CompareEvent(fin1, mid));
                ls.add(new SwapEvent(fin1 + 1, high -1));
                swap(arr, fin1 + 1, high - 1); 
            }else {
                ls.add(new CompareEvent(fin1, mid));
                ls.add(new SwapEvent(fin1, high-1));
                swap(arr, fin1, high - 1);
            }
           
            Sorts.quickSort(arr, low, fin1);
            Sorts.quickSort(arr, fin1+1, high);
        }
        return ls;
    }
    //out customSort is Bubble Sort.
    public static <T extends Comparable<T>> List<SortEvent<T>>  customSort(T[] arr) {
        List<SortEvent<T>> ls = new ArrayList<SortEvent<T>>();
        for (int i = 0; i < arr.length -1; i++){
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j-1].compareTo(arr[j])>0) {
                    ls.add(new CompareEvent(j-1, j));
                    ls.add(new SwapEvent(j-1, j));
                    swap(arr, j-1, j);
                }
                ls.add(new CompareEvent(j-1, j));
            }

        }
        return ls;
    }
    public static <T extends Comparable<T>> void pr(T[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    
    public static <T extends Comparable<T>> void eventSort(T[] arr, List<SortEvent<T>> events){
        for(int i = 0; i < events.size(); i++){
            events.get(i).apply(arr);
        }
    }
    
    public static void main(String[] args){
        Integer[] b = {2, 6, 3, 8, 2, 1, 0, 9, 4, 7, 5};
        Integer[] b1 = {2, 6, 3, 8, 2, 1, 0, 9, 4, 7, 5};
        eventSort(b1, mergeSort(b));
        pr(b1);
    }
}

