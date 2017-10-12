package edu.grinnell.sortingvisualizer.sorts;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import edu.grinnell.sortingvisualizer.*;
import edu.grinnell.sortingvisualizer.sortevents.SortEvent;
import edu.grinnell.sortingvisualizer.*;
public class SortsTest {

    @Test
    //test the selection sort with five examples;
    public void testSelectionSort() {
      //test1: a random array of integers
        Integer[] arr = {8,7,3,6,2,1} ;
        Sorts.selectionSort(arr);
        Integer[] expected = {1,2,3,6,7,8} ;
        assertArrayEquals(arr, expected); 
        
        //test2: a random array of doubles
        Double[] arr1 = {8.1,7.3,3.2,6.4,2.0,1.1} ;
        Sorts.selectionSort(arr1);
        Double[] expected1 = {1.1,2.0,3.2,6.4,7.3,8.1} ;
        assertArrayEquals(arr1, expected1);
        
        //test3: a random array of dog objects
        Dog dog1 = new Dog(5);
        Dog dog2 = new Dog(1);
        Dog dog3 = new Dog(0);
        Dog dog4 = new Dog(2);
        Dog dog5 = new Dog(11);
        
        Dog[] arr2 = {dog1, dog2, dog3, dog4,dog5} ;
        Sorts.selectionSort(arr2);
        Dog[] expected2 = {dog3, dog2, dog4, dog1, dog5} ;
        assertArrayEquals(arr2, expected2);
        
        //test4: an array of integers in ascending order
        Integer[] ascending = {1,2,3,4,5,6};
        Sorts.selectionSort(ascending);
        Integer[] expected3 = {1,2,3,4,5,6};
        assertArrayEquals(ascending, expected3);
        
        //test5: an array of integers in descending order;
        Integer[] desending = {5,4,3,2,1};
        Sorts.selectionSort(desending);
        Integer[] expected4 = {1,2,3,4,5};
        assertArrayEquals(desending, expected4);
        }
        
                
    
    
    public void testInsertionSort() {
        //test1: a random array of integers
        Integer[] arr = {8,7,3,6,2,1} ;
        Sorts.insertionSort(arr);
        Integer[] expected = {1,2,3,6,7,8} ;
        assertArrayEquals(arr, expected); 
        
        //test2: a random array of doubles
        Double[] arr1 = {8.1,7.3,3.2,6.4,2.0,1.1} ;
        Sorts.insertionSort(arr1);
        Double[] expected1 = {1.1,2.0,3.2,6.4,7.3,8.1} ;
        assertArrayEquals(arr1, expected1);
        
        //test3: a random array of dog objects
        Dog dog1 = new Dog(5);
        Dog dog2 = new Dog(1);
        Dog dog3 = new Dog(0);
        Dog dog4 = new Dog(2);
        Dog dog5 = new Dog(11);
        
        Dog[] arr2 = {dog1, dog2, dog3, dog4,dog5} ;
        Sorts.insertionSort(arr2);
        Dog[] expected2 = {dog3, dog2, dog4, dog1, dog5} ;
        assertArrayEquals(arr2, expected2);
        
        //test4: an array of integers in ascending order
        Integer[] ascending = {1,2,3,4,5,6};
        Sorts.insertionSort(ascending);
        Integer[] expected3 = {1,2,3,4,5,6};
        assertArrayEquals(ascending, expected3);
        
        //test5: an array of integers in descending order;
        Integer[] desending = {5,4,3,2,1};
        Sorts.insertionSort(desending);
        Integer[] expected4 = {1,2,3,4,5};
        assertArrayEquals(desending, expected4);
    }
    public void testMergeSort() {
        //test1: a random array of integers
        Integer[] arr = {8,7,3,6,2,1} ;
        Sorts.mergeSort(arr);
        Integer[] expected = {1,2,3,6,7,8} ;
        assertArrayEquals(arr, expected); 
        
        //test2: a random array of doubles
        Double[] arr1 = {8.1,7.3,3.2,6.4,2.0,1.1} ;
        Sorts.mergeSort(arr1);
        Double[] expected1 = {1.1,2.0,3.2,6.4,7.3,8.1} ;
        assertArrayEquals(arr1, expected1);
        
        //test3: a random array of dog objects
        Dog dog1 = new Dog(5);
        Dog dog2 = new Dog(1);
        Dog dog3 = new Dog(0);
        Dog dog4 = new Dog(2);
        Dog dog5 = new Dog(11);
        
        Dog[] arr2 = {dog1, dog2, dog3, dog4,dog5} ;
        Sorts.mergeSort(arr2);
        Dog[] expected2 = {dog3, dog2, dog4, dog1, dog5} ;
        assertArrayEquals(arr2, expected2);
        
        //test4: an array of integers in ascending order
        Integer[] ascending = {1,2,3,4,5,6};
        Sorts.mergeSort(ascending);
        Integer[] expected3 = {1,2,3,4,5,6};
        assertArrayEquals(ascending, expected3);
        
        //test5: an array of integers in descending order;
        Integer[] desending = {5,4,3,2,1};
        Sorts.mergeSort(desending);
        Integer[] expected4 = {1,2,3,4,5};
        assertArrayEquals(desending, expected4);
    }
    
    public void testQuickSort() {
        //test1: a random array of integers
        Integer[] arr = {8,7,3,6,2,1} ;
        Sorts.quickSort(arr);
        Integer[] expected = {1,2,3,6,7,8} ;
        assertArrayEquals(arr, expected); 
        
        //test2: a random array of doubles
        Double[] arr1 = {8.1,7.3,3.2,6.4,2.0,1.1} ;
        Sorts.quickSort(arr1);
        Double[] expected1 = {1.1,2.0,3.2,6.4,7.3,8.1} ;
        assertArrayEquals(arr1, expected1);
        
        //test3: a random array of dog objects
        Dog dog1 = new Dog(5);
        Dog dog2 = new Dog(1);
        Dog dog3 = new Dog(0);
        Dog dog4 = new Dog(2);
        Dog dog5 = new Dog(11);
        
        Dog[] arr2 = {dog1, dog2, dog3, dog4,dog5} ;
        Sorts.quickSort(arr2);
        Dog[] expected2 = {dog3, dog2, dog4, dog1, dog5} ;
        assertArrayEquals(arr2, expected2);
        
        //test4: an array of integers in ascending order
        Integer[] ascending = {1,2,3,4,5,6};
        Sorts.quickSort(ascending);
        Integer[] expected3 = {1,2,3,4,5,6};
        assertArrayEquals(ascending, expected3);
        
        //test5: an array of integers in descending order;
        Integer[] desending = {5,4,3,2,1};
        Sorts.quickSort(desending);
        Integer[] expected4 = {1,2,3,4,5};
        assertArrayEquals(desending, expected4);
    }

    public void testCustomSort() {
        //test1: a random array of integers
        Integer[] arr = {8,7,3,6,2,1} ;
        Sorts.customSort(arr);
        Integer[] expected = {1,2,3,6,7,8} ;
        assertArrayEquals(arr, expected); 
        
        //test2: a random array of doubles
        Double[] arr1 = {8.1,7.3,3.2,6.4,2.0,1.1} ;
        Sorts.customSort(arr1);
        Double[] expected1 = {1.1,2.0,3.2,6.4,7.3,8.1} ;
        assertArrayEquals(arr1, expected1);
        
        //test3: a random array of dog objects
        Dog dog1 = new Dog(5);
        Dog dog2 = new Dog(1);
        Dog dog3 = new Dog(0);
        Dog dog4 = new Dog(2);
        Dog dog5 = new Dog(11);
        
        Dog[] arr2 = {dog1, dog2, dog3, dog4,dog5} ;
        Sorts.customSort(arr2);
        Dog[] expected2 = {dog3, dog2, dog4, dog1, dog5} ;
        assertArrayEquals(arr2, expected2);
        
        //test4: an array of integers in ascending order
        Integer[] ascending = {1,2,3,4,5,6};
        Sorts.customSort(ascending);
        Integer[] expected3 = {1,2,3,4,5,6};
        assertArrayEquals(ascending, expected3);
        
        //test5: an array of integers in desending order;
        Integer[] desending = {5,4,3,2,1};
        Sorts.customSort(desending);
        Integer[] expected4 = {1,2,3,4,5};
        assertArrayEquals(desending, expected4);
    }
    
    
    public void testEventSort() {
        //test1: a random array of integers
        Integer[] arr = {8,7,3,6,2,1} ;
        Integer[] arrcopy = {8,7,3,6,2,1} ;
        List<SortEvent<Integer>> evets = Sorts.customSort(arr);
        Integer[] expected = {1,2,3,6,7,8} ;
        Sorts.eventSort(arrcopy, evets);
        assertArrayEquals(arrcopy, expected); 
      
        //test2: a random array of doubles
        Double[] arr1 = {8.1,7.3,3.2,6.4,2.0,1.1} ;
        Double[] arr1cpy = {8.1,7.3,3.2,6.4,2.0,1.1} ;
        List<SortEvent<Double>> evets1 = Sorts.quickSort(arr1);
        Double[] expected1 = {1.1,2.0,3.2,6.4,7.3,8.1} ;
        Sorts.eventSort(arr1cpy, evets1);
        assertArrayEquals(arr1cpy, expected1);
        
        //test3: a random array of dog objects
        Dog dog1 = new Dog(5);
        Dog dog2 = new Dog(1);
        Dog dog3 = new Dog(0);
        Dog dog4 = new Dog(2);
        Dog dog5 = new Dog(11);
        
        Dog[] arr2 = {dog1, dog2, dog3, dog4,dog5} ;
        Dog[] arr2cpy = {dog1, dog2, dog3, dog4,dog5} ;
        List<SortEvent<Dog>> evets2 = Sorts.mergeSort(arr2);
        Dog[] expected2 = {dog3, dog2, dog4, dog1, dog5} ;
        Sorts.eventSort(arr2cpy, evets2);
        assertArrayEquals(arr2cpy, expected2);
        
        //test4: an array of integers in ascending order
        Integer[] ascending = {1,2,3,4,5,6};
        Integer[] ascendingcpy = {1,2,3,4,5,6};
        List<SortEvent<Integer>> evets3 = Sorts.insertionSort(ascending);
        Integer[] expected3 = {1,2,3,4,5,6};
        Sorts.eventSort(ascendingcpy, evets3);
        assertArrayEquals(ascendingcpy, expected3);
        
        //test5: an array of integers in descending order;
        Integer[] desending = {5,4,3,2,1};
        Integer[] desendingcpy = {5,4,3,2,1};
        List<SortEvent<Integer>> evets4 = Sorts.customSort(desending);
        Integer[] expected4 = {1,2,3,4,5};
        Sorts.eventSort(desendingcpy, evets4);
        assertArrayEquals(desendingcpy, expected4);
    }
    


}
