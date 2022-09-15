package com.example.quickcheck.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@AllArgsConstructor @NoArgsConstructor @Getter @Setter
@Entity
public class Email {

    @Id
    private String id = UUID.randomUUID().toString().toUpperCase();
    @NotNull(message = "Email cannot be null")
    private String emailAdrees;
    @NotNull
    private String domain;
    @NotNull
    private boolean webMail;
    @NotNull
    private boolean spam;


}
