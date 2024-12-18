/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task4;
import java.util.InputMismatchException;
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
        //https://github.com/sba24150/CA2-Programming-and-Math-Paolo-Mazzocco
        
        System.out.println("hello");
        // sc is object of scanner class
        Scanner sc = new Scanner(System.in); // Its create object of scanner class
            try{
               int row = 0;
               int col = 0;
                while(true){
                    try{
                      // Input size of the square matrix
                    System.out.print("Enter size of the row matrix: ");
                    row = sc.nextInt();// we use sc to access function of scanner class.Here function is nextint
                    if (row<=0){
                       System.out.println("Entered number not valid must be greater than 0 "); 
                        }else{
                            break;
                        }
                        }catch(InputMismatchException e){
                            System.out.println("Invalid data type, enter a valid number");
                            sc.nextLine();
                        }
                    }    
                while(true){
                    try{
                    // Input size of the square matrix
                    System.out.print("Enter size of the colomn matrix: ");
                    col = sc.nextInt();// we use sc to access function of scanner class.Here function is nextint
                    if (col<=0){
                        System.out.println("Entered number not valid must be greater than 0 "); 
                        }else{
                            break;
                        }
                    }
                    catch(InputMismatchException e){
                             System.out.println("Invalid data type, enter a valid number");
                             sc.nextLine();
                        }
                    }
                    
                // Initialize the square matrix
                int[][] matrix = new int[row][col];
                
                // Input elements row by row
                System.out.println("Enter elements :");

                    for (int i = 0; i < row; i++) {       
                        for (int j = 0; j< col; j++) {
                            while(true){
                                try{
                                    matrix[i][j] = sc.nextInt();
                                    break;
                                }catch(InputMismatchException e){
                             System.out.println("Invalid data type, enter a valid number");
                             sc.nextLine();
                            }
                        }    
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
                    if (top <= bottom) {
                        for (int i =right; i>=left; i--){
                            System.out.print(matrix[bottom][i]);
                            System.out.print(" ");
                        }
                        bottom--;
                    }    
                    //bottom to top
                    if (left <= right) {
                        for(int i =bottom; i>=top; i--){
                            System.out.print(matrix[i][left]);
                            System.out.print(" ");
                        }
                        left++;
                    }
                }
            }catch (Exception e) {
        System.out.println("An error occurred: " + e.getMessage() );
    } 
                 
    }
    
}
