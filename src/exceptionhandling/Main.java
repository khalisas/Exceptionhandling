/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main (String []args){
        
        int[] array = {0,1,4,3};
        Scanner userInput = new Scanner(System.in);
        System.out.println("nilai arrray ke:");
        int index=userInput.nextInt();
        
        
//        excepton handling(try,catch,finally)
        try{
            System.out.printf("index ke-%d, adalah %d\n" , index, array[index]);
        }catch(Exception e){
            System.out.println(e);
        }
        
        System.out.println("akhir dari program");
        
        
    }
    
}
