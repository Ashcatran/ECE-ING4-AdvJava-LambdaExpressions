/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ece.ing4.advjava.lambdaexpressions.ex3;

import java.util.function.Consumer;

/**
 * Nil class
 * NOT USED
 * after move into Seq.java
 * @author Kevin, Nicolas
 */
public class Nil implements Seq {

    /**
     * Empty constructor
     */
    public Nil() {
    }

    /**
     * Nil last element accept String "END"
     */
    @Override
    public void forEach(Consumer consumer) {
        consumer.accept("END");
    }

    /**
     * NEVER USED
     * move into Seq
     * @param element
     * @return 
     */
    @Override
    public Seq prepend(Object element) {
        //To change body of generated methods, choose Tools | Templates.
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
