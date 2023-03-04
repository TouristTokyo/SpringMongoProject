package com.example.springmongoproject.models;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Document(collection = "in_place")
@Data
public class InPlace {
    @Id
    @Field("id")
    private String id;
    @Field("person_id")
    private String personId;

    @Field("place_id")
    private String placeId;

    @Field("date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime date = LocalDateTime.now();

}
