package com.example.firstdockerproject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.Random;

@Data
@Builder
@AllArgsConstructor
class Gremlin {
    String name;
    String birthday;

    public Gremlin() {
        this.name = "Monster ".concat(getRand());
        this.birthday = String.valueOf(new Date().getTime());
    }

    private String getRand() {
       Random r = new Random();
        return String.valueOf(r.nextInt(100) + 1);

    }
}