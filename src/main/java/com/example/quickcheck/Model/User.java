package com.example.quickcheck.Model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@AllArgsConstructor @NoArgsConstructor @Getter @Setter
@Data
@Entity
public class User {
    @Id
    private String id = UUID.randomUUID().toString().toUpperCase();
    @NotNull(message = "User Name is required")
    private String userName;
    @NotNull(message = "Phone Name is required")
    private String phoneNumber;


}
