package com.heaven.demosecurity.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class VideoEntity {
    private @Id
    @GeneratedValue Long id;
    private String username;
    private String name;
    private String description;

    public VideoEntity() {
        this(null, null, null);
    }

    public VideoEntity(String username, String name, String description) {
        this.id = null;
        this.username = username;
        this.description = description;
        this.name = name;
    }
}
