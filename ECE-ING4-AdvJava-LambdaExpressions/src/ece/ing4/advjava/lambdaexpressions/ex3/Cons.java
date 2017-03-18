/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ece.ing4.advjava.lambdaexpressions.ex3;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * NOT USED
 * @author Kevin, Nicolas
 */
public class Cons implements Seq {

    private final Object element;
    private final Seq next;

    public Cons(Object element, Seq next) {
        this.element = Objects.requireNonNull(element);
        this.next = Objects.requireNonNull(next);
    }

    /**
     * The signature of this method is : forEach(Consumer consumer)
     */
    @Override
    public void forEach(Consumer consumer) {
        consumer.accept(element);
        next.forEach(consumer);
    }

    /**
     * NOT USED
     * @param element
     * @return 
     */
    @Override
    public Seq prepend(Object element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
