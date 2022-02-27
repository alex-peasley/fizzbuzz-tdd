package com.alexpeasley.fizzbuzztdd.converter;

import com.alexpeasley.fizzbuzztdd.model.FizzBuzzProperties;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzConverterTest {
    FizzBuzzConverter fizzBuzzConverter;

    @BeforeEach
    void setUp() {
        FizzBuzzProperties properties = new FizzBuzzProperties();
        properties.setFizz(3);
        properties.setBuzz(5);
        fizzBuzzConverter = new FizzBuzzConverter(properties);
    }

    @Test
    void testMultipleOf3Fizz() {
        assertEquals("Fizz", fizzBuzzConverter.convert(3));
        assertEquals("Fizz", fizzBuzzConverter.convert(6));
        assertEquals("Fizz", fizzBuzzConverter.convert(9));
        assertEquals("Fizz", fizzBuzzConverter.convert(18));
        assertEquals("Fizz", fizzBuzzConverter.convert(33));
        assertEquals("Fizz", fizzBuzzConverter.convert(36));
        assertEquals("Fizz", fizzBuzzConverter.convert(39));
    }

    @Test
    void testMultipleOf5Buzz() {
        assertEquals("Buzz", fizzBuzzConverter.convert(5));
        assertEquals("Buzz", fizzBuzzConverter.convert(10));
        assertEquals("Buzz", fizzBuzzConverter.convert(20));
        assertEquals("Buzz", fizzBuzzConverter.convert(25));
        assertEquals("Buzz", fizzBuzzConverter.convert(85));
        assertEquals("Buzz", fizzBuzzConverter.convert(95));
    }

    @Test
    void testMultipleOf15FizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzzConverter.convert(15));
        assertEquals("FizzBuzz", fizzBuzzConverter.convert(30));
        assertEquals("FizzBuzz", fizzBuzzConverter.convert(45));
        assertEquals("FizzBuzz", fizzBuzzConverter.convert(60));
        assertEquals("FizzBuzz", fizzBuzzConverter.convert(90));
    }
}