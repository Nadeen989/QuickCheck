package com.example.quickcheck.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@AllArgsConstructor @NoArgsConstructor
@Getter
@Setter
@Entity
public class Files {
    @Id
    private String id = UUID.randomUUID().toString().toUpperCase();
    private String name;
    private String deleted;
    private String result;
}
