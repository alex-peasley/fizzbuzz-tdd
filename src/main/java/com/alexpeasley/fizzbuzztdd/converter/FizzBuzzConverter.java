package com.alexpeasley.fizzbuzztdd.converter;

import com.alexpeasley.fizzbuzztdd.model.FizzBuzzTddProperties;

public class FizzBuzzConverter {
    private FizzBuzzTddProperties properties;

    public FizzBuzzConverter(FizzBuzzTddProperties properties) {
        this.properties = properties;
    }

    public String convert(int i) {
        String fizzBuzzConvertedString = "";
        if (i % properties.getFizz() == 0) {
            fizzBuzzConvertedString += "Fizz";
        }
        return fizzBuzzConvertedString;
    }
}
