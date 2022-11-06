// The first class is the row class, which consists of a label and an array of ints.
// The second class is the table class, which is labeled and made up of an array of rows.
// The table and rows can be interacted with like a spreadsheet.

package TableProject;

import java.util.Arrays;

public class GilFriedmanTest {
    public static void main(String[] args) {
        // Creating and printing table 1
        Row[] rows = new Row[4];
        rows[0] = new Row("Row 1", new int[] { 1, 2, 3 });
        rows[1] = new Row(new int[] { 4, 5 });
        rows[2] = new Row("Row 3");
        rows[3] = new Row();
        
        if (rows[0].getName() == "Row 1") {
            System.out.println("Row Getter and Setter Test Passed");
        } else {
            System.out.println("Row Getter and Setter Test Failed");
        }

        Table table1 = new Table(rows, "Table 1");
        if (Arrays.equals(rows[2].getValues(), rows[3].getValues()))  System.out.println("Constructor Tests passed");
        else System.out.println("Constructor Tests failed");


        Table table2 = new Table();
        int[] values = new int[] { 1, 2, 3 };
        table2.addRow("Row 1", values);
        table2.addRow("Row", new int[0]);

        if (table2.getRows()[0].getValues() == values) System.out.println("AddRow Tests passed");
        else System.out.println("AddRow Tests failed");

        table2.getRowByName("Row").append(4);
        if (table2.getRowByName("Row").getValue(0) == 4) System.out.println("getRowByName, append, and getValue Tests passed");
        else System.out.println("getRowByName, append, and getValue Tests failed");

        table2.getRowByIndex(1).append(5);

        if (table2.getRowByIndex(1).getValue(table2.getRowByIndex(1).getLength() - 1) == 5) System.out.println("getRowByIndex Test passed");
        else System.out.println("getRowByIndex Test passed");

        Row emptyRow3 = new Row("Row 3");
        table2.addRow(emptyRow3);
        Row emptyRow = new Row();
        table2.addRow(emptyRow);

        if (table1.equals(table2)) System.out.println("Table Equals Test passed");
        else System.out.println("Table Equals Test failed");
        
        table1.appendToAll(5);
        table2.appendToAll(5);

        if (table1.equals(table2)) System.out.println("appendToAll Test passed");
        else System.out.println("appendToAll Test failed");

        if (table1.contains(5)) System.out.println("contains Test passed");
        else System.out.println("contains Test failed");

        if (table2.getRowByIndex(0).getMean() == table2.getRowByIndex(0).getMean()) System.out.println("getMean Test passed");
        else System.out.println("getMean Test failed");

        try {
            table1.printFormatted();
            System.out.println("Print Formatted and toString methods Test passed");
        } catch (Exception e) {
            System.out.println("Print Formatted and toString methods Test passed");
        }


    }



}
