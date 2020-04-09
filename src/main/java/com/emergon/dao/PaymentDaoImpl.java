/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergon.dao;

import com.emergon.model.Payment;
import java.util.List;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;

/* @author emergon */
@Repository
public class PaymentDaoImpl extends SuperDao implements PaymentDao {

    @Override
    public List<Payment> findAll() {
        Query q = getSession().createNamedQuery("Payment.findAll");
        List<Payment> list = q.getResultList();
        return list;
    }

    @Override
    public Payment findById(int id) {
        Query q = getSession().createNamedQuery("Payment.findById");
        q.setParameter("id", id);
        Payment p = (Payment) q.getSingleResult();
        return p;
    }
}