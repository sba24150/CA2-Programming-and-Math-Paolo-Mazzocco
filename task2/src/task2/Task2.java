/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task2;
import java.util.Scanner;
/**
 *
 * @author paolo
 */
public class Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the table");
        int size;
        
        size = sc.nextInt();
                        
        int[] [] matrix = new int [size] [size];
        
        for (int i=0; i<size; i++ ){
            for (int j=0; j<size; j++ ){
                matrix [i][j]= (i+1)*(j+1) ;
            }
        }
        System.out.println("Multiplication Table");
        for (int i =0; i<size; i++){
            for(int j =0; j<size; j++){
                System.out.println(matrix[i][j]+ " ");
                
            }
            System.out.println(" ");
        }
        
        
    }
    
}
