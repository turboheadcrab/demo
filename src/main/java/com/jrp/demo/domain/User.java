package com.jrp.demo.domain;

public class User {
    private String fullName;
    private int age;
    private boolean employed;
    private String sex;

    public User() {
    }

    public User(String fullName, int age, boolean isEmployed, String sex) {
        this.fullName = fullName;
        this.age = age;
        this.employed = isEmployed;
        this.sex = sex;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isEmployed() {
        return employed;
    }

    public void setEmployed(boolean employed) {
        this.employed = employed;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
