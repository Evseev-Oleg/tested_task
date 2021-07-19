package com.evseevoleg.spring.mvc_hibernate.controller;

import com.evseevoleg.spring.mvc_hibernate.entity.InformationDocument;
import com.evseevoleg.spring.mvc_hibernate.entity.PeopleShow;
import com.evseevoleg.spring.mvc_hibernate.entity.Document;
import com.evseevoleg.spring.mvc_hibernate.entity.People;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

/**
 * класс валидирующий и преобразующий полученные данные
 * для MyController
 */
public class ValidationWork {
    public String formAge(LocalDate localDate) {
        return String.valueOf(Period.between(localDate, LocalDate.now()).getYears());
    }

    public List<PeopleShow> formPeopleShow(List<People> peopleList) {
        List<PeopleShow> peopleShows = new ArrayList<>();
        for (People allPerson : peopleList) {
            String first_name = allPerson.getFirstName();
            String last_name = allPerson.getLastName();
            String patronymic = allPerson.getPatronymic();
            String date = allPerson.getBirthday();
            peopleShows.add(new PeopleShow(first_name,
                    last_name, patronymic, formAge(LocalDate.parse(date))));
        }
        return peopleShows;
    }

    public InformationDocument changeInformationDocumentParam(
            String series, String number, String date, People people, Document document) {
        InformationDocument informationDocument = new InformationDocument();
        if (series != null && number != null && date != null) {
            informationDocument.setSeries(Integer.parseInt(series));
            informationDocument.setNumber(Integer.parseInt(number));
            informationDocument.setDate(date);
            informationDocument.setPeople(people);
            informationDocument.setDocument(document);
            return informationDocument;
        } else if (series != null && number != null && date == null) {
            informationDocument.setSeries(Integer.parseInt(series));
            informationDocument.setNumber(Integer.parseInt(number));
            informationDocument.setDate(null);
            informationDocument.setPeople(people);
            informationDocument.setDocument(document);
            return informationDocument;
        } else if (series != null && number == null && date == null) {
            informationDocument.setSeries(Integer.parseInt(series));
            informationDocument.setNumber(0);
            informationDocument.setDate(null);
            informationDocument.setPeople(people);
            informationDocument.setDocument(document);
            return informationDocument;
        } else if (series == null && number != null && date != null) {
            informationDocument.setSeries(0);
            informationDocument.setNumber(Integer.parseInt(number));
            informationDocument.setDate(date);
            informationDocument.setPeople(people);
            informationDocument.setDocument(document);
            return informationDocument;
        } else if (series == null && number != null && date == null) {
            informationDocument.setSeries(0);
            informationDocument.setNumber(Integer.parseInt(number));
            informationDocument.setDate(null);
            informationDocument.setPeople(people);
            informationDocument.setDocument(document);
            return informationDocument;
        } else if (series == null && number == null && date != null) {
            informationDocument.setSeries(0);
            informationDocument.setNumber(0);
            informationDocument.setDate(date);
            informationDocument.setPeople(people);
            informationDocument.setDocument(document);
            return informationDocument;
        } else {
            informationDocument.setSeries(0);
            informationDocument.setNumber(0);
            informationDocument.setDate(null);
            informationDocument.setPeople(people);
            informationDocument.setDocument(document);
            return informationDocument;
        }
    }
}
