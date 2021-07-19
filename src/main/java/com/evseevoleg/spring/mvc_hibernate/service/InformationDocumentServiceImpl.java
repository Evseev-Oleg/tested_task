package com.evseevoleg.spring.mvc_hibernate.service;

import com.evseevoleg.spring.mvc_hibernate.entity.InformationDocument;
import com.evseevoleg.spring.mvc_hibernate.dao.InformationDocumentDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * реализует интерфейс Service
 */
@Service
public class InformationDocumentServiceImpl implements InformationDocumentService {
    @Autowired
    private InformationDocumentDAOImpl informationDocumentDAO;

    @Override
    @Transactional
    public List<InformationDocument> getAllInfoDocument() {
        return informationDocumentDAO.getAllInfoDocument();
    }

    @Override
    @Transactional
    public void saveInfDoc(InformationDocument informationDocument) {
        informationDocumentDAO.saveInfDoc(informationDocument);
    }
}
