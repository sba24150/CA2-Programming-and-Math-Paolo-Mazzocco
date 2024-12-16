/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task5;
import java.util.Scanner;
/**
 *
 * @author paolo
 */
public class Task5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hello");
        
        Scanner sc = new Scanner(System.in); // Its create object of scanner class

        // Input size of the square matrix
        System.out.print("Enter size of the Array: ");
        int size = sc.nextInt();// we use sc to access function of scanner class.Here function is nextint
        int swapNum = 0;
        int [] array = new int [size];
        
        System.out.println("Enter elements :");
        
        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }
        for (int i=0; i<size; i++){
            System.out.println(array[i]+" ");//it should print in a single row 
        }
        boolean swap =true;
        while(swap){
            swap=false;
            for (int i =0; i<size-1; i++){
                if (array[i]>array[i+1]){
                    swap=true;
                    swapNum++;
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1]=temp;
                   
                }
                
            }
            
        }
        
        System.out.println("number of Swaps are: " + swapNum);
        for (int i=0; i<size; i++){
            System.out.println("sorted array is: " + array[i]);
        }
        
        
        
    }
    
}
