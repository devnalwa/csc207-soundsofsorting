package edu.grinnell.sortingvisualizer;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ArrayPanel extends JPanel {

    private NoteIndices notes;
    
    /**
     * Constructs a new ArrayPanel that renders the given note indices to
     * the screen.
     * @param notes the indices to render
     * @param width the width of the panel
     * @param height the height of the panel
     */
    public ArrayPanel(NoteIndices notes, int width, int height) {
        this.notes = notes;
        this.setPreferredSize(new Dimension(width, height));
    }

    @Override
    //takes nothing, render the note indices to the screen
    public void paintComponent(Graphics g) {
        int height = this.getSize().height;
        int width = this.getSize().width;
        
        Integer[] ls = notes.getNotes();
        //get the biggest value in the list
        int high = ls[0]; 
        for(int i=0; i< ls.length; i++) {
            if(high < ls[i]){
                high = ls[i];
            }
        }
        //draw
        int rwidth = width/ls.length;
        for(int i = 0; i < ls.length; i++){
            g.clearRect (i * rwidth, 0, rwidth, height);
            if(notes.getHighlights()[i]){
                g.setColor(new Color(255, 0, 0));
            }else {
                g.setColor(new Color(50, (1 - ls[i] / high) * 255 , 255 * ls[i] / high));
            }
            g.fillRect(i * rwidth, height - height * ls[i] / high, rwidth, height * ls[i] / high);
        }
        notes.clearAllHighlighted();
        
    }
}