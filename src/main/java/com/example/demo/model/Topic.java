package com.example.demo.model;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Topic {

    private String dataType;
    private String name;
    private String plan;
    private Schemas schemas;
}
