/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ece.ing4.advjava.lambdaexpressions.ex3;

import java.util.function.Consumer;

/**
 * NOT USED
 * @author Kevin, Nicolas
 */
public class Nil implements Seq {

    public Nil() {
    }

    @Override
    public void forEach(Consumer consumer) {
        consumer.accept("END");
    }

    @Override
    public Seq prepend(Object element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
