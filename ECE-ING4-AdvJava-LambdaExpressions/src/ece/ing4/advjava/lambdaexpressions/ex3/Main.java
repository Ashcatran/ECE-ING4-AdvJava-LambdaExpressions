/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ece.ing4.advjava.lambdaexpressions.ex3;

/**
 *
 * @author Kevin, Nicolas
 */
public class Main {

    public static void main(String[] args) {

        /**
         * Static nested classes are accessed using the enclosing class name. It
         * does not have reference to the nesting instance. So it cannot invoke
         * non-tatic fields of the class within which it is nested.
         * 
         * Non-static nested class has full access of the members of the class 
         * within which it is nested.
         */
        Seq seq = Seq.nil();
        Seq seq2 = seq.prepend("world").prepend("hello");
        //Seq seq3 = seq.prepend("world").prepend(3);
        seq2.forEach (System.out :: println);
    }
}
