/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task.pkg3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author paolo
 */
public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Github link below
        //https://github.com/sba24150/CA2-Programming-and-Math-Paolo-Mazzocco

        System.out.println("Hello");

        // sc is object of scanner class
        Scanner sc = new Scanner(System.in); // Its create object of scanner class
        try {
            int size = 0;
            while (size <= 0) {
                try {
                    // Input size of the square matrix
                    System.out.println("Enter the size of the square matrix :");
                    size = sc.nextInt();// we use sc to access function of scanner class.Here function is nextint
                    if (size <= 0) {
                        System.out.println("Entered number not valid must be greater than 0 ");
                    } else {
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid data type, enter a valid number");
                    sc.nextLine();
                }
            }
            // Initialize the square matrix
            int[][] matrix = new int[size][size];

            // Input elements row by row
            System.out.println("Enter elements row by row :");

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    while (true) {
                        try {
                            matrix[i][j] = sc.nextInt();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid data type, enter a valid number");
                            sc.nextLine();
                        }
                    }
                }// To display the matrix in 2D Form
            }
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(matrix[i][j] + "  ");
                }
                System.out.println("");
            }
            // Variables to store the sums of diagonals
            int mainDiagonalSum = 0;
            int secondaryDiagonalSum = 0;
            // Calculate the diagonal sums
            for (int i = 0; i < size; i++) {

                mainDiagonalSum += matrix[i][i]; // Main diagonal
                secondaryDiagonalSum += matrix[i][size - i - 1];//Secondary Diagonal 
            }

            // Output results
            System.out.println("Main Diagonal Sum: " + mainDiagonalSum);
            System.out.println("Secondary Diagonal Sum: " + secondaryDiagonalSum);

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

}
