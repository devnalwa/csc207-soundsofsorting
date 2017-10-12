package edu.grinnell.sortingvisualizer.sortevents;

import java.util.ArrayList;
import java.util.List;
import edu.grinnell.sortingvisualizer.*;

public interface SortEvent<T> {
    public void apply(T[] arr);
    public List<Integer> getAffectedIndices();
    public boolean isEmphasized();
}
