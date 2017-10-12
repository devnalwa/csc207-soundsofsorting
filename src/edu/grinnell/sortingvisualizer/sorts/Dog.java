package edu.grinnell.sortingvisualizer.sorts;

public class Dog implements Comparable<Dog> {
    private int eyes;
    
    public Dog(int val){
        this.eyes = val;
    }
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
