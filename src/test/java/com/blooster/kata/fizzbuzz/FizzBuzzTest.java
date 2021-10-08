package com.blooster.kata.fizzbuzz;


import org.assertj.core.api.Assertions;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void shouldPrintNormalNumber() {
        FizzBuzz fb = new FizzBuzz();
        Assertions.assertThat("1").isEqualTo(fb.convert(1));
        Assertions.assertThat("2").isEqualTo(fb.convert(2));
    }

    @Test
    public void shouldPrintFizzIfNumberDividedBy3() {
        FizzBuzz fb = new FizzBuzz();
        Assertions.assertThat("Fizz").isEqualTo(fb.convert(21));
    }

    @Test
    public void shouldPrintBuzzIfNumberContains3() {
        FizzBuzz fb = new FizzBuzz();
        Assertions.assertThat("Fizz").isEqualTo(fb.convert(23));
    }

    @Test
    public void shouldPrintFizzIfNumberDividedBy5() {
        FizzBuzz fb = new FizzBuzz();
        Assertions.assertThat("Buzz").isEqualTo(fb.convert(10));
    }

    @Test
    public void shouldPrintFizzIfNumberContains5() {
        FizzBuzz fb = new FizzBuzz();
        Assertions.assertThat("Buzz").isEqualTo(fb.convert(25));
    }

    @Test
    public void shouldPrintFizzBuzzIfNumberDividedBy3And5() {
        FizzBuzz fb = new FizzBuzz();
        Assertions.assertThat("FizzBuzz").isEqualTo(fb.convert(15));
    }
}