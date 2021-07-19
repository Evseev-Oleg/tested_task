package com.evseevoleg.spring.mvc_hibernate.service;

import com.evseevoleg.spring.mvc_hibernate.entity.InformationDocument;

import java.util.List;

/**
 * интерфейс, который предоставляет с себя основную
 */
public interface InformationDocumentService {

    List<InformationDocument> getAllInfoDocument();

    public void saveInfDoc(InformationDocument informationDocument);
}
