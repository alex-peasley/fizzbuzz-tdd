package com.alexpeasley.fizzbuzztdd.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "fizzbuzz")
@Data
public class FizzBuzzProperties {
    private int fizz;
    private int buzz;
}
