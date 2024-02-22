package com.auth.service.model.entity;


import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document("tenant")
public class Tenant {

    @MongoId
    private String tenantId;
}
