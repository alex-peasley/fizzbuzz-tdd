package com.alexpeasley.fizzbuzztdd.converter;

import com.alexpeasley.fizzbuzztdd.model.FizzBuzzTddProperties;
import org.springframework.util.StringUtils;

public class FizzBuzzConverter {
    private FizzBuzzTddProperties properties;

    public FizzBuzzConverter(FizzBuzzTddProperties properties) {
        this.properties = properties;
    }

    public String convert(int i) {
        String fizzBuzzConvertedString = String.valueOf(i);
        if (i % (properties.getFizz() * properties.getBuzz()) == 0) {
            fizzBuzzConvertedString = "FizzBuzz";
        }
        else if (i % properties.getFizz() == 0) {
            fizzBuzzConvertedString = "Fizz";
        }
        else if (i % properties.getBuzz() == 0) {
            fizzBuzzConvertedString = "Buzz";
        }
        return fizzBuzzConvertedString;
    }
}
