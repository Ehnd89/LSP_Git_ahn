package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntegerSet {
    private List<Integer> set = new ArrayList<Integer>();

    public IntegerSet() {
    }

    public IntegerSet(ArrayList<Integer> set) {
        this.set = set;
        
    }

    public void clear() {
        set.clear();
    }

    public int length() {
        return set.size();
    }

    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof IntegerSet))
            return false;
        IntegerSet otherSet = (IntegerSet) o;

        Set<Integer> thisSet = new HashSet<>(set);
        Set<Integer> other = new HashSet<>(otherSet.set);

        return thisSet.equals(other);
    }

    public boolean contains(int value) {
        return set.contains(value);
    }

    public int largest() throws IntegerSetException {
        if (set.isEmpty()) {
            throw new IntegerSetException("Set is empty");
        }
        int max = set.get(0);
        for (int num : set) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public int smallest() throws IntegerSetException {
        if (set.isEmpty()) {
            throw new IntegerSetException("Set is empty");
        }
        int min = set.get(0);
        for (int num : set) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

    public void remove(int item) {
        set.remove(Integer.valueOf(item));
    }

    public void union(IntegerSet intSetb) {
        Set<Integer> unionSet = new HashSet<>(set);
        unionSet.addAll(intSetb.set);
        set = new ArrayList<>(unionSet);
    }

    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }

    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    public void complement(IntegerSet intSetb) {
        Set<Integer> complementSet = new HashSet<>(intSetb.set);
        complementSet.removeAll(set);
        set = new ArrayList<>(complementSet);
    }

    public boolean isEmpty() {
        return set.isEmpty();
    }

    public String toString() {
        return set.toString();
    }
}