package com.blooster.kata.fizzbuzz;

public class FizzBuzz {

    public String convert(int i) {

        if(i%15 == 0) {
            return "FizzBuzz";
        }
        else if(i%3 == 0 || String.valueOf(i).contains("3")) {
            return "Fizz";
        }
        else if(i%5 == 0 || String.valueOf(i).contains("5")) {
            return "Buzz";
        }
        else {
            return String.valueOf(i);
        }
    }
}
