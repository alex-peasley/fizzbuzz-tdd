package com.alexpeasley.fizzbuzztdd.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "fizzbuzz")
@Data
public class FizzBuzzProperties {
    private int fizz;
    private int buzz;
    private int rounds;
}
