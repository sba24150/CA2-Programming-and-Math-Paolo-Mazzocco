/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task.pkg3;

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
        
        System.out.println("hello");
        
        // sc is object of scanner class
        Scanner sc = new Scanner(System.in); // Its create object of scanner class
            try {
            // Input size of the square matrix
            System.out.print("Enter size square matrix: ");
            int size = sc.nextInt();// we use sc to access function of scanner class.Here function is nextint
            if (size<=0){
                System.out.println("Entered number not valid ");
                }else{




                // Initialize the square matrix
                int[][] matrix = new int[size][size];

                // Input elements row by row
                System.out.println("Enter elements row by row :");

                        for (int i = 0; i < size; i++) {       
                    for (int j = 0; j< size; j++) {
                        matrix[i][j] = sc.nextInt();
                               }
                }// To display the matrix in 2D Form

                for(int i=0; i<size; i++){
                        for(int j=0; j<size; j++){
                                System.out.print(matrix[i][j]+"  ");
                        }
                                System.out.println("");
                }
                // Variables to store the sums of diagonals
                int mainDiagonalSum = 0;
                int secondaryDiagonalSum = 0;
                // Calculate the diagonal sums
                for (int i = 0; i < size; i++) {
                    for(int j=0; j<size; j++){
                    if(i==j){
                    mainDiagonalSum += matrix[i][i]; // Main diagonal
                    secondaryDiagonalSum += matrix [i][size-i-1];//Secondary Diagonal 
                     }
                    }
                }
                // Output results
                System.out.println("Main Diagonal Sum: " + mainDiagonalSum);
                System.out.println("Secondary Diagonal Sum: " + secondaryDiagonalSum);
            }
        }catch (Exception e) {
        System.out.println("User input is not a numer.");
    }            
    }
    
}
