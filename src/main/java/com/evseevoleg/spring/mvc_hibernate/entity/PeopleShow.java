package com.evseevoleg.spring.mvc_hibernate.entity;


/**
 * сущность для страницы информации о всех людях
 */
public class PeopleShow {
    private String firstName;
    private String lastName;
    private String patronymic;
    private String age;

    public PeopleShow() {
    }

    public PeopleShow(String firstName, String lastName, String patronymic, String age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}