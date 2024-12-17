/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task4;
import java.util.Scanner;
/**
 *
 * @author paolo
 */
public class Task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hello");
        // sc is object of scanner class
        Scanner sc = new Scanner(System.in); // Its create object of scanner class
            try{
            // Input size of the square matrix
            System.out.print("Enter size of the row matrix: ");
            int row = sc.nextInt();// we use sc to access function of scanner class.Here function is nextint

            System.out.print("Enter size of the coloum matrix: ");
            int col = sc.nextInt();
            if (col<=0 || row<=0){
                    System.out.println("Entered number not valid must be greater than 0 ");
                            }else{
                // Initialize the square matrix
                int[][] matrix = new int[row][col];
                
                // Input elements row by row
                System.out.println("Enter elements :");

                        for (int i = 0; i < row; i++) {       
                    for (int j = 0; j< col; j++) {
                        matrix[i][j] = sc.nextInt();
                               }
                }
                // To display the matrix in 2D Form

                for(int i=0; i<row; i++){
                        for(int j=0; j<col; j++){
                                System.out.print(matrix[i][j]+"  ");
                        }
                                System.out.println("");
                }
                System.out.print("Spiral traversal of the matrix : " );
                // definig the 4 starting point from where the loop will start at time 
                int top = 0;// top row of the matrix
                int bottom = row - 1;// bottom row of the matrix
                int left = 0;//left column of the matrix
                int right = col-1;// right column of the matrix
                // the spiral will go from left to right on the first row

                while (left<=right && top<=bottom){
                    for (int i=left; i<=right; i++){
                        System.out.print(matrix[top][i]);
                        System.out.print(" ");
                    }            
                    top++;

                    //top to bottom right column
                    for (int i=top; i<=bottom; i++){
                        System.out.print(matrix[i][right]);
                        System.out.print(" ");
                    }
                    right--;
                   
                    //right to left
                    for (int i =right; i>=left; i--){
                        System.out.print(matrix[bottom][i]);
                        System.out.print(" ");
                    }
                    bottom--;
                    //bottom to top
                    for(int i =bottom; i>=top; i--){
                        System.out.print(matrix[i][left]);
                        System.out.print(" ");
                    }
                    left++;
                }
            }
        }catch (Exception e) {
        System.out.println("User input is not a number.");
    }          
    }
    
}
