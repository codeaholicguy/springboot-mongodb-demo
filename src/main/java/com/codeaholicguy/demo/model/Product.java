package com.codeaholicguy.demo.model;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * Created by nguyennhathoang on 2/9/16.
 */
public class Product implements Serializable {

    @Id
    private String id;
    private String name;

    public Product(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
