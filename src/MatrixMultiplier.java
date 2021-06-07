// Java program to read a matrix from user

import java.util.Scanner;
import java.io.*;

public class MatrixMultiplier {

	// Function to print Matrix
    static void printMatrix(int M[][], int rowSize, int colSize){
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++)
                System.out.print(M[i][j] + " ");
  
            System.out.println();
        }
    }


	// Driver code
	public static void main(String[] args)
	{
		int r1, c1, r2, c2, i, j, k;
        Scanner in = null;
        in = new Scanner(System.in);
        System.out.println("Enter the number of rows of first matrix");
        r1 = in.nextInt();
        System.out.println("Enter the number of columns of first matrix");
        c1 = in.nextInt();

        // Declare the matrix
        int first[][] = new int[r1][c1];

        // Read the matrix values
        System.out.println("Enter the elements of first matrix");
        for (i = 0; i < r1; i++)
            for (j = 0; j < c1; j++)
                first[i][j] = in.nextInt();


        // Display the elements of the matrix
        System.out.println("Elements of first matrix are");
        printMatrix(first, r1, c1);

        //second matrix
        System.out.println("Enter the number of rows of second matrix");
        r2 = in.nextInt();
        System.out.println("Enter the number of columns of second matrix");
        c2 = in.nextInt();

        // Declare the matrix
        int second[][] = new int[r2][c2];

        // Read the matrix values
        System.out.println("Enter the elements of second matrix");
        for (i = 0; i < r2; i++)
            for (j = 0; j < c2; j++)
                second[i][j] = in.nextInt();

        printMatrix(second, r2, c2);

        if (r2 != c1) {
            System.out.println("Multiplication Not Possible\n");
            return;
        }

        int result[][] = new int[r1][c2];

        for (i = 0; i < r1; i++) {
            for (j = 0; j < c2; j++) {
                result[i][j] = 0;
                for (k = 0; k < r2; k++)
                    result[i][j] += first[i][k] * second[k][j];
            }
        }

        System.out.println("Elements of resultant matrix are");
        int resRow = r1, resCol = c2;
        printMatrix(result, resRow, resCol);

	}
                
}
