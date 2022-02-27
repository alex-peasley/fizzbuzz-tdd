package com.alexpeasley.fizzbuzztdd;

import com.alexpeasley.fizzbuzztdd.converter.FizzBuzzConverter;
import org.springframework.stereotype.Component;

@Component
public class FizzBuzzRunner {

    private FizzBuzzConverter fizzBuzzConverter;

    public FizzBuzzRunner(FizzBuzzConverter fizzBuzzConverter) {
        this.fizzBuzzConverter = fizzBuzzConverter;
    }
}
