package com.example.springmongoproject.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "persons")
@Data
public class Person {
    @Id
    @Field("id")
    private String id;

    @Field("name")
    private String name;

    @Field("age")
    private Integer age;
    @Field("sex")
    private String sex;
}
