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

        // Input size of the square matrix
        System.out.print("Enter size of the row matrix: ");
        int row = sc.nextInt();// we use sc to access function of scanner class.Here function is nextint

        System.out.print("Enter size of the coloum matrix: ");
        int col = sc.nextInt();
        
// Initialize the square matrix
        int[][] matrix = new int[row][col];

        // Input elements row by row
        System.out.println("Enter elements :");
        
                for (int i = 0; i < row; i++) {       
            for (int j = 0; j< col; j++) {
                matrix[i][j] = sc.nextInt();
                       }
        }
    //    [1  2  3]
     //   [4  5  6]
      //  [7  8  9]
        
        // To display the matrix in 2D Form

for(int i=0; i<row; i++){
	for(int j=0; j<col; j++){
		System.out.print(matrix[i][j]+"  ");
	}
		System.out.println("");
}

//////////////////

        
// Variables to store the sums of diagonals
        int mainDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        // Calculate the diagonal sums
        for (int i = 0; i < row; i++) {
            for(int j=0; j<col; j++){
            if(i==j){
            mainDiagonalSum += matrix[i][i]; // Main diagonal
            secondaryDiagonalSum += matrix [i][col-i-1];//Secondary Diagonal 
             }
            }
        }
        // Output results
        System.out.println("Main Diagonal Sum: " + mainDiagonalSum);
        System.out.println("Secondary Diagonal Sum: " + secondaryDiagonalSum);
    }
    
}
