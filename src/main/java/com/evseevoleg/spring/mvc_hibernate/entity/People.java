package com.evseevoleg.spring.mvc_hibernate.entity;

import javax.persistence.*;;import java.util.HashSet;
import java.util.Set;

/**
 * класс-таблица people с БД
 */
@Entity
@Table(name = "people")
public class People {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "patronymic")
    private String patronymic;

    @Column(name = "birthday")
    private String birthday;

    @Column(name = "sex")
    private String sex;

    private Set<InformationDocument> informationDocuments = new HashSet<>();

    public People() {
    }

    public People(String firstName, String lastName, String patronymic, String date, String sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.birthday = date;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String date) {
        this.birthday = date;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @OneToMany(mappedBy = "people")
    public Set<InformationDocument> getInformationDocuments() {
        return informationDocuments;
    }

    public void setInformationDocuments(Set<InformationDocument> informationDocument) {
        this.informationDocuments = informationDocument;
    }

    public void addInfoDoc(InformationDocument informationDocument) {
        this.informationDocuments.add(informationDocument);
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", date=" + birthday +
                ", sex=" + sex +
                '}';
    }
}
