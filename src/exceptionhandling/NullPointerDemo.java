/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

/**
 *
 * @author LENOVO
 */
public class NullPointerDemo {
     public static void main(String[] args) {
       String name=null;
       try{
       System.out.print("Length of the string"+name.length());
       }catch(NullPointerException e){
           System.out.println(e);
       }
    
}
}
