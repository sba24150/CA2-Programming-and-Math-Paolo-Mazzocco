/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task.pkg1;

import java.util.InputMismatchException;
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
        //Github link below
        //https://github.com/sba24150/CA2-Programming-and-Math-Paolo-Mazzocco
        
        System.out.println("Hello");

        Scanner sc = new Scanner(System.in); // Its create object of scanner class
        try {
            int size = 0;

            // Input size of the square matrix
            while (true) {
                try {
                    // Input size of the square matrix
                    System.out.print("Enter size of the array: ");
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

            int[] array = new int[size];
            System.out.println("Enter element of the array");

            for (int i = 0; i < size; i++) {
                while (true) {
                    try {
                        array[i] = sc.nextInt();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid data type, enter a valid number");
                        sc.nextLine();
                    }
                }
            }
            boolean found = false;
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        System.out.println("repeted number: " + array[i]);
                        found = true;
                    }
                }

            }
            if (found == false) {
                System.out.println("no repeted number found");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }// if you input the same number for all the time it will print a lot of time the same number 

}
