/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ece.ing4.advjava.lambdaexpressions.ex1;

import java.util.Comparator;
import java.util.TreeSet;

/**
 *
 * @author Kevin Nicolas
 */
public class LambdaExpressionsEx1 {

    /**
     * @param args the command line arguments
     */
    public void main(String[] args) {
        /**
         * Q1
         * Lambda expression of Runnable
         */
        Thread thread = new Thread(() -> {
            System.out.println("Hello world !");
        });
        thread.start();
        /**
         * Q2
         * Iterator is an interface provided by JavaAPI which is 
         * a funtional interface
         */        
        
        /**
         * Q3:
         * This second expression is more readable (shorter)
         * no nested constructor
         * no override of function, only one lambda expression 
         */
        
        /**
         * Q4
         */
        TreeSet<String> treeSet = new TreeSet<>(
                (f1, f2) -> {return f1.compareTo(f2);}
        );
        // Method reference
        Comparator<String> compareString = (o1, o2) -> o1.compareTo(o2);
        TreeSet<String> treeSet2 = new TreeSet<>(compareString);
    }

}
