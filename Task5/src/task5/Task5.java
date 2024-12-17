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
        
            try{
            // Input size of the square matrix
            System.out.print("Enter size of the Array: ");
            int size = sc.nextInt();// we use sc to access function of scanner class.Here function is nextint
            int swapNum = 0;
            int [] array = new int [size];
            if (size<=0){
                System.out.println("Entered number not valid ");
                    }else{

                System.out.println("Enter elements :");

                for(int i=0; i<size; i++){
                    array[i] = sc.nextInt();
                }
                System.out.println();
                System.out.println("Input array: ");
                for (int i=0; i<size; i++){
                    System.out.print(array[i]+" ");
                }
                System.out.println(" ");
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
                System.out.println("Number of Swaps are: " + swapNum);
                System.out.println();
                
                System.out.print("Sorted array is: ");
                for (int i=0; i<size; i++){
                    System.out.print(array[i] + " ");
                }
                System.out.println();
            }
        }catch (Exception e) {
        System.out.println("User input is not a number.");
    }         
    }   
}
