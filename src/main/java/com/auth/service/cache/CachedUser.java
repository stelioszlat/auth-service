package com.auth.service.cache;

import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("user")
public class User implements Serializable {
    private String id;
    private String name;
    private String tenant;
}
