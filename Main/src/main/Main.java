/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import java.util.Scanner;
/**
 *
 * @author paolo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hello");
        
//task 1//
        //
        boolean found = false;
        Scanner sc = new Scanner(System.in);
        int size;
        
        System.out.println("Enter the size of the array");
        
        size = sc.nextInt();
        
        int [] a = new int[size];
        
        System.out.println("Enter the array element");
        
        for (int i=0; i<size; i++){
        a[i]= sc.nextInt();
        }
        
        for (int i=0; i<a.length ; i++ ){
            for (int j = i+1; j<a.length; j++){
                if (a[i]== a[j]){
                    System.out.println("repeted number: " + a [i] );
                    found = true;
                }
            }                
        }
        if (found == false)
            System.out.println("No repeted number found");
        //To fix the bug if the all munbers are the same//
        
        //task 2//
        //System.out.println("Import the size of the table");
        
    }
    
}

