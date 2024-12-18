/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author paolo
 */
public class Task2 {

    /**
     * @param args the command line arguments
     */
    //Github link below
    //https://github.com/sba24150/CA2-Programming-and-Math-Paolo-Mazzocco
    public static void main(String[] args) {
        // TODO code application logic here
        

        System.out.println("Hello");

        Scanner sc = new Scanner(System.in);
        try {

            int size = 0;

            while (size <= 0) {
                try {
                    // Input size of the square matrix
                    System.out.println("Enter the size of the table :");
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

            int[][] matrix = new int[size][size];
            
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    matrix[i][j] = (i + 1) * (j + 1);
                }
            }
            System.out.println("Multiplication Table");
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(matrix[i][j] + " ");

                }
                System.out.println(" ");
            }

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

    }

}
