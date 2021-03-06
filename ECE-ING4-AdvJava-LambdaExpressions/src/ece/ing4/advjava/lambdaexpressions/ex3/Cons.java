/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ece.ing4.advjava.lambdaexpressions.ex3;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Cons class
 * NEVER USED
 * after move into Seq.java
 * @author Kevin, Nicolas
 */
public class Cons implements Seq {

    private final Object element;
    private final Seq next;

    /**
     * Constructor
     * @param element
     * @param next 
     */
    public Cons(Object element, Seq next) {
        this.element = Objects.requireNonNull(element);
        this.next = Objects.requireNonNull(next);
    }

    /*
     * Q2
     * The signature of this method is : forEach(Consumer consumer)
     */
    /**
     * Accept and go to next element f the sequence (Cons or Nil)
     * @param consumer 
     */
    @Override
    public void forEach(Consumer consumer) {
        consumer.accept(element);
        next.forEach(consumer);
    }

    /**
     * Create new cons with this cons as next
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
