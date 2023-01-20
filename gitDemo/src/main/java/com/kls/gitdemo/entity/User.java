package com.kls.gitdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kangqing
 * @since 2023/1/20 08:03
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String id;

    private String name;

    private String age;

    private String email;

    private String status;


    public User(String name) {
        this.name = name;
    }
}
