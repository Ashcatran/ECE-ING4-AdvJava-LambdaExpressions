/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ece.ing4.advjava.lambdaexpressions.ex2;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
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
        int avg = new Random().ints(1000, 0, 100).sum()/1000;
        System.out.println(avg);
        
        /**
         * Q3
         */
        Stream s = Stream.of(new Teacher("Ravaut", Gender.MALE),
                new Teacher("Soukane", Gender.FEMALE),
                new Teacher("Palasi", Gender.FEMALE),
                new Teacher("Segado", Gender.MALE),
                new Teacher("Diedler", Gender.MALE));
        
        List <Gender> names  = Stream.of(new Teacher("Ravaut", Gender.MALE),
                new Teacher("Soukane", Gender.FEMALE),
                new Teacher("Palasi", Gender.FEMALE),
                new Teacher("Segado", Gender.MALE),
                new Teacher("Diedler", Gender.MALE))
            .map(t -> t.getGender())
            .collect (Collectors.toList());
        /*
        Map<Gender, List<Teacher>> map = Stream.of(new Teacher("Ravaut", Gender.MALE),
                new Teacher("Soukane", Gender.FEMALE),
                new Teacher("Palasi", Gender.FEMALE),
                new Teacher("Segado", Gender.MALE),
                new Teacher("Diedler", Gender.MALE))
            .collect(Collectors.toMap(Teacher::getGender(),  Employee::getName,
                                      (oldValue, newValue)  ->  String.join(", ", oldValue,  newValue))); ));
*/
        /*
        Map<Gender, List<Teacher>> map = Stream.of(new Teacher("Ravaut", Gender.MALE),
                new Teacher("Soukane", Gender.FEMALE),
                new Teacher("Palasi", Gender.FEMALE),
                new Teacher("Segado", Gender.MALE),
                new Teacher("Diedler", Gender.MALE))
                .map(t -> t)
                .collect(Collectors.toMap(key -> key.getGender(), 
                    t -> t,
                    (oldList, t) -> oldList.add(t)
                    )); 
        
        
        
    System.out.println(map);*/
  
}

}


