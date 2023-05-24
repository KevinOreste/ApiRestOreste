package com.example.ClientApiRestOreste.DTOs;

import org.springframework.cglib.core.Local;

public class ClientDTO {

    private String name;
    private String lastName;
    private int age;

    @Override
    public String toString() {
        return "ClientDTO{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", anios=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
