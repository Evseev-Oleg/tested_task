package com.evseevoleg.spring.mvc_hibernate.entity;

import javax.persistence.*;

/**
 * класс-таблица document с БД
 */
@Entity
@Table(name = "documents")
public class InformationDocument {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "type_id")
    private int typeId;

    @Column(name = "people_id")
    private int peopleId;


    @Column(name = "series")
    private int series;


    @Column(name = "number")
    private int number;

    @Column(name = "date")
    private String date;

    private People people;
    private Document document;

    public InformationDocument() {
    }

    public InformationDocument(int typeId, int peopleId, int series, int number, String date) {
        this.typeId = typeId;
        this.peopleId = peopleId;
        this.series = series;
        this.number = number;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public int getPeopleId() {
        return peopleId;
    }

    public void setPeopleId(int peopleId) {
        this.peopleId = peopleId;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "people_id")
    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "type_id")
    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    @Override
    public String toString() {
        return "InformationDocument{" +
                "id=" + id +
                ", typeId=" + typeId +
                ", peopleId=" + peopleId +
                ", series=" + series +
                ", number=" + number +
                ", date='" + date + '\'' +
                ", people=" + people +
                ", document=" + document +
                '}';
    }
}
