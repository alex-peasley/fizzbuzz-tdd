package com.alexpeasley.fizzbuzztdd.converter;

import com.alexpeasley.fizzbuzztdd.model.FizzBuzzTddProperties;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzConverterTest {
    FizzBuzzConverter fizzBuzzConverter;

    @BeforeEach
    void setUp() {
        FizzBuzzTddProperties properties = new FizzBuzzTddProperties();
        properties.setFizz(3);
        properties.setBuzz(5);
        fizzBuzzConverter = new FizzBuzzConverter(properties);
    }

    @Test
    void testMultipleOf3Fizz() {
        for (int i = 3; i <= 100; i+=3) {
            assertEquals("Fizz", fizzBuzzConverter.convert(i));
        }
    }

    @Test
    void testMultipleOf5Buzz() {
        for (int i = 5; i <= 100; i+=5) {
            assertEquals("Buzz", fizzBuzzConverter.convert(i));
        }
    }

    @Test
    void testMultipleOf15FizzBuzz() {
        for (int i = 15; i <= 100; i+=15) {
            assertEquals("FizzBuzz", fizzBuzzConverter.convert(i));
        }
    }
}