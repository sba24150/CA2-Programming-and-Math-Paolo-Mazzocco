/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task5;

import java.util.InputMismatchException;
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
        //Github link below
        //https://github.com/sba24150/CA2-Programming-and-Math-Paolo-Mazzocco

        System.out.println("Hello");

        Scanner sc = new Scanner(System.in); // Its create object of scanner class

        try {
            // Input size of the square matrix
            int size = 0;
            while (size <= 0) {
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
            int swapNum = 0;
            int[] array = new int[size];

            System.out.println("Enter elements :");

            for (int i = 0; i < size; i++) {
                try {
                    array[i] = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid data type, enter a valid number");
                    i--;
                    sc.nextLine();
                }
            }
            System.out.println();
            System.out.println("Input array: ");
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println(" ");
            boolean swap = true;
            while (swap) {
                swap = false;
                for (int i = 0; i < size - 1; i++) {
                    if (array[i] > array[i + 1]) {
                        swap = true;
                        swapNum++;
                        int temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                    }
                }
            }
            System.out.println("Number of Swaps are: " + swapNum);
            System.out.println();

            System.out.print("Sorted array is: ");
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
