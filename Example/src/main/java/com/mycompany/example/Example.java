/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.example;

/**
 *
 * @author kmlnd
 */
public class Example {
    public static void main(String[] args) {
    
        



    //Calling the Method       
    add(10,20);
    //Now the Method will add 10 + 20
        System.out.println(add(10,20));
        
        
        
    //Calling the Method without perameters
    //Now the Method will say Hi
    //System.out.println(""); is already in method so it will print it out
    //can put anything in this method type to call
    hello();
    
    
    }
    
/*==========================================================================        
  Method with perameters       
==========================================================================*/ 
    
    //The Method
    public static int add(int firstNumber, int secondNumber){
        int addedNumbers = firstNumber + secondNumber;
        return addedNumbers;
    }
        
/*==========================================================================        
  Method without perameters       
==========================================================================*/
        
    // IF THE METHOD HAS NO PERAMETERS MUST PUT VOID INSTEAD OF DATA TYPE INT, BOOLEAN, STRING
    public static void hello(){
        System.out.println("Hello World!!");    
    }
    
}
