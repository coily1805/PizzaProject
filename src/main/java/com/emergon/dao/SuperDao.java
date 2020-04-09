package com.emergon.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/* @author emergon */
public class SuperDao {

    @Autowired
    protected SessionFactory sessionFactory;

    protected Session getSession() {
        Session s = sessionFactory.getCurrentSession();
        return s;
    }
    
}