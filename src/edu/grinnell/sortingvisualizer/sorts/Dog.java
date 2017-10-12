package edu.grinnell.sortingvisualizer.sorts;

import edu.grinnell.sortingvisualizer.*;

public class Dog implements Comparable<Dog> {
    //fields
    private int eyes;
    //constructor
    public Dog(int val){
        this.eyes = val;
    }
    
    //compareTO takes in another dog object
    //returns -1 if eyes of this dog is smaller than the other dog;
    //returns 0 if eyes of the dogs are same;
    //returns 1 if eyes of this dog is bigger than the other dog.
    public int compareTo(Dog other) {
        if (this.eyes < other.eyes) {
            return -1;
        } else if (this.eyes > other.eyes) {
            return 1;
        } else {
            return 0;
        }
    }

}
