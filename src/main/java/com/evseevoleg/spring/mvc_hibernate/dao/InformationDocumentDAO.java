package com.evseevoleg.spring.mvc_hibernate.dao;

import com.evseevoleg.spring.mvc_hibernate.entity.InformationDocument;

import java.util.List;

/**
 * интерфейс ответственный за работу с БД
 */
public interface InformationDocumentDAO {

    List<InformationDocument> getAllInfoDocument();

    void saveInfDoc(InformationDocument informationDocument);
}
