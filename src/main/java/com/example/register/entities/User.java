package com.example.register.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document ("user_detail")
public class User {

    @Id
    private String ratingId;
    private String name;
    private String email;
    private String password;
    private  int phone;
}
