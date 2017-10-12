package edu.grinnell.sortingvisualizer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A collection of indices into a Scale object.
 * These indices are the subject of the various sorting algorithms
 * in the program.
 */
public class NoteIndices {

    /**
     * @param n the size of the scale object that these indices map into
     */
    private Integer[] indices;
    private Boolean[] highlights;
    //constructor, takes an integer n and create an integer array of length
    //n and boolean array of n
    public NoteIndices(int n) {
        this.indices = new Integer[n];
        this.highlights = new Boolean[n];
        
    }
    
    /**
     * Reinitializes this collection of indices to map into a new scale object
     * of the given size.  The collection is also shuffled to provide an
     * initial starting point for the sorting process.
     * @param n the size of the scale object that these indices map into
     */
    public void initializeAndShuffle(int n) {
        NoteIndices temp = new NoteIndices(n);
        
        List<Integer> ls = new ArrayList<>(n);
        for(int i = 0; i<n; i++){
            ls.add(i, i);
        }
        Collections.shuffle(ls);
        for(int i = 0; i< n; i++){
            temp.indices[i] = ls.get(i);
        }
        for(int i =0; i< n; i++){
            temp.highlights[i] = false;
        }
        this.indices = temp.indices;
        this.highlights = temp.highlights;
    }
    
    /** @return the indices of this NoteIndices object */
    public Integer[] getNotes() { 
        return indices;
    }
    
    public Boolean[] getHighlights(){
        return highlights;
    }
    /**
     * Highlights the given index of the note array
     * @param index the index to highlight
     */
    public void highlightNote(int index) {
        highlights[index] = true;
    }
    
    /** @return true if the given index is highlighted */


    
    /** Clears all highlighted indices from this collection */
    public void clearAllHighlighted() {
        for(int i = 0; i< highlights.length; i++ ){
            highlights[i] = false;
        }
    }
}
