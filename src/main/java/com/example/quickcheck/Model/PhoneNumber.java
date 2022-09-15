package com.example.quickcheck.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor @NoArgsConstructor
@Getter
@Setter
@Entity
public class PhoneNumber {
    @Id

    private String number;
    private String response;
}
