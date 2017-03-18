/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ece.ing4.advjava.lambdaexpressions.ex3;

import java.util.Objects;
import java.util.function.Consumer;

/**
 *
 * @author Kevin, Nicolas
 * @param <T>
 */
public interface Seq <T> {

    /**
     * Last element of a sequence
     * The class's type parameters are only in the scope for instance methods
     * and instance fields. Static methods and fields are shared among all 
     * instances of different type parameters. So they cannot depend on a 
     * particular type parameter.
     * @return () -> function("END")
     */
    public static Seq nil() {
        return new Nil();
    }

    public Seq <T> prepend(T element);

    /**
     * Apply a function for each element of the sequence
     *
     * @param consumer
     */
    public void forEach(Consumer consumer);

    /**
     * Object in sequence
     * @param <T>
     */
    public class Cons <T> implements Seq <T> {

        private final T element;
        private final Seq next;

        /**
         * Constructor
         * @param element
         * @param next 
         */
        public Cons (T element, Seq next) {
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
         * New Cons containing this Con as next
         * @param element
         * @return 
         */
        @Override
        public Seq <T> prepend(T element) {
            return new Cons(element, this);
        }

    }

    /**
     * Last object
     * @param <T>
     */
    public class Nil <T> implements Seq <T> {

        public Nil() {
        }

        /**
         * "END" as last item
         * @param consumer 
         */
        @Override
        public void forEach(Consumer consumer) {
            consumer.accept("END");
        }

        /**
         * New Cons with this as next
         * @param element
         * @return 
         */
        @Override
        public Seq prepend(T element) {
            return new Cons <T> (element, new Seq <T> () {
                @Override
                public Seq prepend(T element) {
                    return nil();
                }

                @Override
                public void forEach(Consumer consumer) {
                    consumer.accept("END");
                }
            });
        }
    }
}
