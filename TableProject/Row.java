package TableProject;

import java.util.Arrays;

public class Row {
    private String name;
    private int[] values;
    private int length;

    public Row(String name, int[] values) {
        this.name = name;
        this.values = values;
        length = values.length;
    }

    public Row() {
        this.name = "Row";
        this.values = new int[0];
        length = values.length;
    }

    public Row(String name) {
        this.name = name;
        this.values = new int[0];
        length = values.length;
    }

    public Row(int[] values) {
        this.name = "Row";
        this.values = values;
        length = values.length;
    }

    public String getName() {
        return name;
    }

    public int[] getValues() {
        if (values == null) {
            return new int[0];
        }
        return values;
    }

    public int getLength() {
        return length;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue(int index) {
        return values[index];
    }

    public void setValue(int index, int value) {
        values[index] = value;
    }

    public boolean equals(Row other) {
        return Arrays.equals(values, other.values);
    }

    public String toString() {
        return name + ": " + Arrays.toString(values);
    }

    public int sum() {
        int sum = 0;
        for (int i : values) {
            sum += i;
        }
        return sum;
    }

    public int compareTo(Row other) {
        return sum() - other.sum();
    }

    public boolean contains(int value) {
        for (int i : values)
            if (i == value) return true;
        return false;
    }

    public void append(int value) {
        int[] newValues = new int[length + 1];
        for (int i = 0; i < length; i++) {
            newValues[i] = values[i];
        }
        newValues[length] = value;
        values = newValues;
        length++;
    }

    public double getMean() {
        return (double) sum() / length;
    }

    public double getMedian(){
        int[] sorted = values.clone();
        Arrays.sort(sorted);
        if (length % 2 == 0) return (sorted[length/2] + sorted[length/2-1])/2.0;
        else return (sorted[length/2]);
    }
}
