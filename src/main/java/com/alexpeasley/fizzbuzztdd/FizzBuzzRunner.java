package com.alexpeasley.fizzbuzztdd;

import com.alexpeasley.fizzbuzztdd.converter.FizzBuzzConverter;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class FizzBuzzRunner {

    private FizzBuzzConverter fizzBuzzConverter;

    public FizzBuzzRunner(FizzBuzzConverter fizzBuzzConverter) {
        this.fizzBuzzConverter = fizzBuzzConverter;
    }

    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzzConverter.convert(i));
        }
    }

    @PostConstruct
    public void init() {
        this.run();
    }
}
