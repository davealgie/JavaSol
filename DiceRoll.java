package com.qa.helloworld;
import java.util.Random;


public class DiceRoll {

    public static void main(String[] args) {
        System.out.println(rollTwoDTwenty());
    }

    public static int rollTwoDTwenty() {
        int total = 0;
        total += rollDTwenty();
        total += rollDTwenty();
        return total;
    }

    public static int rollDTwenty() {
        return new Random().nextInt(21);
    }

}