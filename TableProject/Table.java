package TableProject;

import java.util.Arrays;

public class Table {
    private Row[] rows;
    private String tableName;

    public Table(Row[] rows, String tableName) {
        this.rows = rows;
        this.tableName = tableName;
    }

    public Table() {
        this.rows = new Row[0];
        this.tableName = "Unnamed Table";
    }

    public Row[] getRows() {
        return rows;
    }

    public Row getRowByIndex(int index) {
        return rows[index];
    }

    public Row getRowByName(String name) {
        for (Row row : rows) {
            if (row.getName().equals(name)) {
                return row;
            }
        }
        return null;
    }

    public String toString() {
        return tableName + ": " + Arrays.toString(rows);
    }

    public boolean equals(Table other) {
        int a = 0;
        for (Row i : rows) {
            if (!i.equals(other.rows[a])) {
                return false;
            }
            a++;
        }
        return true;

    }

    public int compareTo(Table other) {
        int thisSum = 0;
        int otherSum = 0;
        for (Row row : rows)
            thisSum += row.sum();
        for (Row row : other.rows)
            otherSum += row.sum();
        return thisSum - otherSum;

    }

    public void printFormatted() {
        System.out.println();
        System.out.println(tableName);
        int maxLength = 0;
        for (Row row : rows) {
            System.out.print(row.getName() + "\t");
            if (row.getLength() > maxLength) {
                maxLength = row.getLength();
            }
        }
        for (int j = 0; j < maxLength; j++) {
            System.out.println();
            for (Row row : rows) {
                if (row.getLength() > j) {
                    System.out.print(row.getValue(j) + "\t");
                }
            }
        }
        System.out.println();
        System.out.println();

    }

    public boolean contains(int value) {
        for (Row row : rows) {
            if (row.contains(value))
                return true;
            return false;
        }
        return false;
    }

    public void appendToAll(int value) {
        for (Row row : rows) {
            row.append(value);
        }
    }

    public void addRow(String name, int[] values) {
        Row[] newRows = new Row[rows.length + 1];
        for (int i = 0; i < rows.length; i++) {
            newRows[i] = rows[i];
        }
        newRows[rows.length] = new Row(name, values);
        rows = newRows;
    }

    public void addRow(Row row) {
        Row[] newRows = new Row[rows.length + 1];
        for (int i = 0; i < rows.length; i++) {
            newRows[i] = rows[i];
        }
        newRows[rows.length] = row;
        rows = newRows;
    }

}
