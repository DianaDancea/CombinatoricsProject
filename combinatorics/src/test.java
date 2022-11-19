//Combinatorics Research Project - Connection Between Hall's Marriage Theorem and Birkoff's Theorem
//Class: MATH 3260 - Dr. Lei Cao
//Project started: November 17, 2022
//Author: Diana E. Dancea
//Version: 1.1

import java.util.*;

public class test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of rows: ");
        int rows  = sc.nextInt();

        System.out.println("Please enter the number of columns: ");
        int columns = sc.nextInt();

        //Creating the Matrix (2D Array)
        int matrix[][] = new int[rows][columns];

        System.out.println("Please enter the matrix data, starting from the first row: ");

        //This loop takes in the input data and adds it to the matrix
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                matrix[i][j] = sc.nextInt();
            }
        }


        /*There are multiple ways to print the matrix
        Each method prints the matrix in a different format
        The one that is commented uses 2 for loops*/

        /*for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }*/

        //This method of printing the rows is more direct
        for(int[] r: matrix){
            System.out.println(Arrays.toString(r));
        }

        //Another method is the line below
        //System.out.println(Arrays.deepToString(data));


        int column1Total = 0;
        int row1Total = 0;
        int column2Total = 0;
        int row2Total = 0;

        //This calculates the row and column totals of the first column and row
        for(int i = 0; i < matrix.length; i++){
            column1Total += matrix[i][0];
        }

        for(int i = 0; i < matrix.length; i++){
            row1Total += matrix[0][i];
        }

        System.out.println("Column 1 Total:"+ column1Total);
        System.out.println("Row 1 Total:"+ row1Total);

        //This calculates the row and column totals of the second column and row
        for(int i = 0; i < matrix.length; i++){
            column2Total += matrix[i][1];
        }

        for(int i = 0; i < matrix.length; i++){
            row2Total += matrix[1][i];
        }

        System.out.println("Column 2 Total:"+ column2Total);
        System.out.println("Row 2 Total:"+ row2Total);

    }

}
