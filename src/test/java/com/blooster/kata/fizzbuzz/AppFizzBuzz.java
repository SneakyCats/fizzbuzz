package com.blooster.kata.fizzbuzz;

import org.junit.Test;

public class AppFizzBuzz {

    @Test
    public void outputTheHundredFizzBuzzes(){

        FizzBuzz fb = new FizzBuzz();
        for(int i=1; i<=100; i++){
            System.out.println(fb.convert(i));
        }
    }
}
