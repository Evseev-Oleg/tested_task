package com.evseevoleg.spring.mvc_hibernate.dao;

import com.evseevoleg.spring.mvc_hibernate.entity.InformationDocument;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InformationDocumentDAOImpl implements InformationDocumentDAO {
    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public List<InformationDocument> getAllInfoDocument() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from InformationDocument", InformationDocument.class)
                .getResultList();
    }
}
