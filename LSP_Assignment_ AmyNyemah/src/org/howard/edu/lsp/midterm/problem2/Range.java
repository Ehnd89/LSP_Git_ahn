package org.howard.edu.lsp.midterm.problem2;

public class Range {
    private int start;
    private int end;

    public Range(int start, int end) {
        if (start > end) {
            throw new IllegalArgumentException("Start value cannot be greater than end value.");
        }
        this.start = start;
        this.end = end;
    }

    public boolean isValueInRange(int value) {
        return value >= start && value <= end;
    }

    public boolean doRangesOverlap(Range otherRange) {
        return start <= otherRange.end && end >= otherRange.start;
    }

    public int size() {
        return end - start + 1;
    }
}