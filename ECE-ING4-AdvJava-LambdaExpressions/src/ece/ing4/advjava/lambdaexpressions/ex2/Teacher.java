/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ece.ing4.advjava.lambdaexpressions.ex2;

/**
 * Given Model
 * @author Kevin, Nicolas
 */
public class Teacher {
    private final String name;
    private final Gender gender;

    public Teacher(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }
}
