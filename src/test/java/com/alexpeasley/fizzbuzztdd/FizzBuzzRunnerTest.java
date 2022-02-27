package com.alexpeasley.fizzbuzztdd;

import com.alexpeasley.fizzbuzztdd.converter.FizzBuzzConverter;
import com.alexpeasley.fizzbuzztdd.model.FizzBuzzTddProperties;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzRunnerTest {
    /*
        The best way to test the runner,
         is to count the occurrences of Fizz, Buzz and FizzBuzz
          and compare it to what we expect.
     */

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    void testFizzBuzzRunner() {
        FizzBuzzTddProperties properties = new FizzBuzzTddProperties();
        properties.setFizz(3);
        properties.setBuzz(5);
        FizzBuzzConverter converter = new FizzBuzzConverter(properties);
        FizzBuzzRunner fizzBuzzRunner = new FizzBuzzRunner(converter);

    }
}