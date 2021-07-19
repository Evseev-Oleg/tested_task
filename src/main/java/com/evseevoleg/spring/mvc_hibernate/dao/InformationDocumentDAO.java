package com.evseevoleg.spring.mvc_hibernate.dao;

import com.evseevoleg.spring.mvc_hibernate.entity.InformationDocument;

import java.util.List;

public interface InformationDocumentDAO {

    List<InformationDocument> getAllInfoDocument();
}
