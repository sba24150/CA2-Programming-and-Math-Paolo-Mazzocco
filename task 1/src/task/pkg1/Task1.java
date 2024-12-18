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
    //Github link below
    //https://github.com/sba24150/CA2-Programming-and-Math-Paolo-Mazzocco
    public static void main(String[] args) {
        // TODO code application logic here
        

        System.out.println("Hello");

        Scanner sc = new Scanner(System.in); // Its create object of scanner class
        try {
            int size = 0;

            // Input size of the square matrix
            while (size <= 0) {
                try {
                    // Input size of the square matrix
                    System.out.print("Enter size of the array: ");
                    size = sc.nextInt();// we use sc to access function of scanner class.Here function is nextint
                    if (size <= 0) {
                        System.out.println("Entered number not valid must be greater than 0 ");//If the number is 0 or less, it will trow the message
                    } else {
                        break;//If the number is grether than 0 it will go out of the while loop
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid data type, enter a valid number");//In the case the input is not a valid type it will trow the message
                    sc.nextLine();
                }
            }

            int[] array = new int[size];

            System.out.println("Enter element of the array");
            for (int i = 0; i < size; i++) {
                try {
                    array[i] = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid data type, enter a valid number");
                    i--;
                    sc.nextLine();
                }
            }
            //Check if the the index of the first loop is the same number of the index of the second loop
            //Introduced "find" variable to avoid to display te same number repeded more then once
            boolean found = false;
            boolean find = false;
            for (int i = 0; i < array.length; i++) {
                find = false;
                for (int j = i + 1; j < array.length && !find; j++) {
                    if (array[i] == array[j]) {
                        System.out.println("repeted number: " + array[i]);
                        found = true;
                        find = true;
                    }
                }

            }
            if (found == false) {
                System.out.println("no repeted number found");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

}
