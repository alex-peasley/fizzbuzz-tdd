package com.alexpeasley.fizzbuzztdd.converter;

import com.alexpeasley.fizzbuzztdd.model.FizzBuzzProperties;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class FizzBuzzConverter {
    private FizzBuzzProperties properties;

    public FizzBuzzConverter(FizzBuzzProperties properties) {
        this.properties = properties;
    }

    public String convert(int i) {
        String fizzBuzzConvertedString = String.valueOf(i);
        int fizz = properties.getFizz();
        int buzz = properties.getBuzz();
        if (i % (fizz * buzz) == 0) {
            fizzBuzzConvertedString = "FizzBuzz";
        }
        else if (i % fizz == 0) {
            fizzBuzzConvertedString = "Fizz";
        }
        else if (i % buzz == 0) {
            fizzBuzzConvertedString = "Buzz";
        }
        return fizzBuzzConvertedString;
    }
}
