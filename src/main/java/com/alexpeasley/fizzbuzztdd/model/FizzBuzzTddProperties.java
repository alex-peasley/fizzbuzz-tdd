package com.alexpeasley.fizzbuzztdd.model;

import lombok.Data;
import org.springframework.boot.SpringBootConfiguration;

@SpringBootConfiguration
@Data
public class FizzBuzzTddProperties {
    private int fizz;
    private int buzz;
}
