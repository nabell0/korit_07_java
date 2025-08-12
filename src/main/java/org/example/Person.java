package org.example;

import lombok.AllArgsConstructor;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@Setter
@Getter
@Builder
public class Person {
    private String name;
    private double height;
    private double weight;
}
