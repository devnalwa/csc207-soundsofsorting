package edu.grinnell.sortingvisualizer.sorts;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import edu.grinnell.sortingvisualizer.*;
public class SortsTest {

    @Test
    public void testSelectionSort() {
        Integer[] arr = {8,7,3,6,2,1} ;
        Sorts.selectionSort(arr);
        Integer[] expected = {1,2,3,6,7,8} ;
        assertEquals(arr, expected); 
        
        Double[] arr1 = {8.1,7.3,3.2,6.4,2.0,1.1} ;
        Sorts.selectionSort(arr1);
        Double[] expected1 = {1.1,2.0,3.2,6.4,7.3,8.1} ;
        assertEquals(arr1, expected1);
        
        Dog dog1 = new Dog(5);
        Dog dog2 = new Dog(1);
        Dog dog3 = new Dog(0);
        Dog dog4 = new Dog(2);
        Dog dog5 = new Dog(11);
        
        Dog[] arr2 = {dog1, dog2, dog3, dog4,dog5} ;
        Sorts.selectionSort(arr2);
        Dog[] expected2 = {dog3, dog2, dog4, dog1, dog5} ;
        assertEquals(arr2, expected2);
                
    }
    
    public void testInsertionSort() {
        Integer[] arr = {8,7,3,6,2,1} ;
        Sorts.insertionSort(arr);
        Integer[] expected = {1,2,3,6,7,8} ;
        assertEquals(arr, expected); 
        
        Double[] arr1 = {8.1,7.3,3.2,6.4,2.0,1.1} ;
        Sorts.insertionSort(arr1);
        Double[] expected1 = {1.1,2.0,3.2,6.4,7.3,8.1} ;
        assertEquals(arr1, expected1);
        
        Dog dog1 = new Dog(5);
        Dog dog2 = new Dog(1);
        Dog dog3 = new Dog(0);
        Dog dog4 = new Dog(2);
        Dog dog5 = new Dog(11);
        
        Dog[] arr2 = {dog1, dog2, dog3, dog4,dog5} ;
        Sorts.insertionSort(arr2);
        Dog[] expected2 = {dog3, dog2, dog4, dog1, dog5} ;
        assertEquals(arr2, expected2);
    }
    public void testMergeSort() {
        Integer[] arr = {8,7,3,6,2,1} ;
        Sorts.mergeSort(arr);
        Integer[] expected = {1,2,3,6,7,8} ;
        assertEquals(arr, expected); 
        
        Double[] arr1 = {8.1,7.3,3.2,6.4,2.0,1.1} ;
        Sorts.mergeSort(arr1);
        Double[] expected1 = {1.1,2.0,3.2,6.4,7.3,8.1} ;
        assertEquals(arr1, expected1);
        
        Dog dog1 = new Dog(5);
        Dog dog2 = new Dog(1);
        Dog dog3 = new Dog(0);
        Dog dog4 = new Dog(2);
        Dog dog5 = new Dog(11);
        
        Dog[] arr2 = {dog1, dog2, dog3, dog4,dog5} ;
        Sorts.mergeSort(arr2);
        Dog[] expected2 = {dog3, dog2, dog4, dog1, dog5} ;
        assertEquals(arr2, expected2);
    }
    
    public void testQuickSort() {
        Integer[] arr = {8,7,3,6,2,1} ;
        Sorts.quickSort(arr);
        Integer[] expected = {1,2,3,6,7,8} ;
        assertEquals(arr, expected); 
        
        Double[] arr1 = {8.1,7.3,3.2,6.4,2.0,1.1} ;
        Sorts.quickSort(arr1);
        Double[] expected1 = {1.1,2.0,3.2,6.4,7.3,8.1} ;
        assertEquals(arr1, expected1);
        
        Dog dog1 = new Dog(5);
        Dog dog2 = new Dog(1);
        Dog dog3 = new Dog(0);
        Dog dog4 = new Dog(2);
        Dog dog5 = new Dog(11);
        
        Dog[] arr2 = {dog1, dog2, dog3, dog4,dog5} ;
        Sorts.quickSort(arr2);
        Dog[] expected2 = {dog3, dog2, dog4, dog1, dog5} ;
        assertEquals(arr2, expected2);
    }

    public void testCustomSort() {
        Integer[] arr = {8,7,3,6,2,1} ;
        Sorts.customSort(arr);
        Integer[] expected = {1,2,3,6,7,8} ;
        assertEquals(arr, expected); 
        
        Double[] arr1 = {8.1,7.3,3.2,6.4,2.0,1.1} ;
        Sorts.customSort(arr1);
        Double[] expected1 = {1.1,2.0,3.2,6.4,7.3,8.1} ;
        assertEquals(arr1, expected1);
        
        Dog dog1 = new Dog(5);
        Dog dog2 = new Dog(1);
        Dog dog3 = new Dog(0);
        Dog dog4 = new Dog(2);
        Dog dog5 = new Dog(11);
        
        Dog[] arr2 = {dog1, dog2, dog3, dog4,dog5} ;
        Sorts.customSort(arr2);
        Dog[] expected2 = {dog3, dog2, dog4, dog1, dog5} ;
        assertEquals(arr2, expected2);
    }
    /*public void testEventSort() {
        Integer[] arr = {8,7,3,6,2,1} ;
        Sorts.customSort(arr);
        Integer[] expected = {1,2,3,6,7,8} ;
        assertEquals(arr, expected); 
        
        Double[] arr1 = {8.1,7.3,3.2,6.4,2.0,1.1} ;
        Sorts.customSort(arr1);
        Double[] expected1 = {1.1,2.0,3.2,6.4,7.3,8.1} ;
        assertEquals(arr1, expected1);
        
        Dog dog1 = new Dog(5);
        Dog dog2 = new Dog(1);
        Dog dog3 = new Dog(0);
        Dog dog4 = new Dog(2);
        Dog dog5 = new Dog(11);
        
        Dog[] arr2 = {dog1, dog2, dog3, dog4,dog5} ;
        Sorts.customSort(arr2);
        Dog[] expected2 = {dog3, dog2, dog4, dog1, dog5} ;
        assertEquals(arr2, expected2);
    }
*/


}
