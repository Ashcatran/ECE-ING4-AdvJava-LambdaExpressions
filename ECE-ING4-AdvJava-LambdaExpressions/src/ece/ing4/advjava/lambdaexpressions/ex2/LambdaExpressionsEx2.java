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
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Average of 1000 rand between 0 and 100 and Map of teacher from stream
 * @author Kevin Nicolas
 */
public class LambdaExpressionsEx2 {

    /**
     * Main function
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
         * Q1-Q2
         * Average of 1000 rand between 0 and 100
         */
        int numberOfRand = 1000;
        int minValue = 0;
        int maxValue = 100;
        double avg = computeAvgOfRand(numberOfRand, minValue, maxValue);
        System.out.println("Average of 1000 rand between 0 and 100 is\n"
                + avg
                + "\n");

        /*
         * Q3
         */
        Stream<Teacher> list = Stream.of(
                new Teacher("Ravaut", Gender.MALE),
                new Teacher("Soukane", Gender.FEMALE),
                new Teacher("Palasi", Gender.FEMALE),
                new Teacher("Segado", Gender.MALE),
                new Teacher("Diedler", Gender.MALE));

        // Get Map
        Map<Gender, List<Teacher>> map = getMap(list);

        // Display Map        
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

    /**
     * Compute average of nbOfRand values between minValue and maxValue
     * @param nbOfRand
     * @param minValue
     * @param maxValue
     * @return 
     */
    public static double computeAvgOfRand (int nbOfRand, int minValue, 
            int maxValue) {
        return new Random()
                .ints(nbOfRand, minValue, maxValue)
                .average()
                .getAsDouble();
    }

    /**
     * Convert Stream of Teacher in to Map of teacher following gender
     * @param list
     * @return
     */
    public static Map<Gender, List<Teacher>> getMap(Stream<Teacher> list) {
        return list.collect(Collectors.toMap(t -> t.getGender(),
                Arrays::asList,
                (t1, t2) -> {
                    List<Teacher> t = new ArrayList<>();
                    t.addAll(t1);
                    t.addAll(t2);
                    return t;
                }
        ));
    }

}
