package com.auth.service.model.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document("user")
public class User {

    @Id
    private String id;

    private String name;

    private String password;

    private String tenant;


}
