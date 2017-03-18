/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ece.ing4.advjava.lambdaexpressions.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Kevin Nicolas
 */
public class LambdaExpressionsEx2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Q1-Q2
         */
        OptionalDouble avg = new Random().ints(1000, 0, 100).average();
        System.out.println("Average of 1000 rand between 0 and 100 is\n" 
                + avg.getAsDouble()
                +"\n");

        /**
         * Q3
         */
        // Map
        Map<Gender, List<Teacher>> map = Stream.of(new Teacher("Ravaut", Gender.MALE),
                new Teacher("Soukane", Gender.FEMALE),
                new Teacher("Palasi", Gender.FEMALE),
                new Teacher("Segado", Gender.MALE),
                new Teacher("Diedler", Gender.MALE))
                //.map(getGender)
                .collect(Collectors.toMap(t -> t.getGender(),
                        Arrays::asList,
                        (t1, t2) -> {
                            List<Teacher> t = new ArrayList<>();
                            t.addAll(t1);
                            t.addAll(t2);
                            return t;
                        }
                ));
        
        // Display        
        map.entrySet().stream().map((set) -> {
            System.out.println(set.getKey());
            return set;
        }).map((set) -> {
            set.getValue().forEach((t) -> {
                System.out.println("\t" + t.getName());
            });
            return set;
        }).forEachOrdered((_item) -> {
            System.out.println("\n");
        });
    }

}
