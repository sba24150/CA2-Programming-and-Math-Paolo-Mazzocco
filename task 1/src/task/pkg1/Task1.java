/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task.pkg1;

import java.util.Scanner;

/**
 *
 * @author paolo
 */
public class Task1 {

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
            boolean found = false;
            int [] array = new int [size];
            if (size<=0){
                System.out.println("Entered number not valid ");
                }else{
                System.out.println("Enter elements :");

                for(int i=0; i<size; i++){
                    array[i] = sc.nextInt();
                }

                for (int i=0; i<array.length ; i++ ){
                    for (int j = i+1; j<array.length; j++){
                        if (array[i]== array[j]){
                            System.out.println("repeted number: " + array[i] );
                            found = true;
                        }
                    }

                }
                if (found == false)
                    System.out.println("no repeted number found");
                }
        }catch (Exception e) {
        System.out.println("User input is not a number.");
    }
    }// if you input the same number for all the time it will print a lot of time the same number 
    
}
