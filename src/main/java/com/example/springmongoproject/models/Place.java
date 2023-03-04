package com.example.springmongoproject.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "places")
@Data
public class Place {
    @Id
    @Field("id")
    private String id;
    @Field("name")
    private String name;

    @Field("point")
    private GeoJsonPoint point;
}
