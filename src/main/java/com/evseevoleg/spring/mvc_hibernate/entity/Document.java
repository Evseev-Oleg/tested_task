package com.evseevoleg.spring.mvc_hibernate.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "type_document")
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    private Set<InformationDocument> informationDocuments = new HashSet<>();


    public Document() {
    }

    public Document(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "document")
    public Set<InformationDocument> getInformationDocuments() {
        return informationDocuments;
    }

    public void setInformationDocuments(Set<InformationDocument> informationDocuments) {
        this.informationDocuments = informationDocuments;
    }

    public void addInfoDoc(InformationDocument informationDocument) {
        this.informationDocuments.add(informationDocument);
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
