package com.example.firstdockerproject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Builder
@AllArgsConstructor
@Document(collection = "gremlins")
public class GremlinEntity {
    @Id
    String id;

    String name;
    String birthday;

    public GremlinEntity() {
        Gremlin gremlin = new Gremlin();
        this.name = gremlin.name;
        this.birthday = gremlin.birthday;
    }
}
