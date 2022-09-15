package com.example.quickcheck.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Url {

    @Id
    private String id = UUID.randomUUID().toString().toUpperCase();
    private String url;
    private String name;
    private String detected;
    private String result;


}
