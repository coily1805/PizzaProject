/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergon.service;

import com.emergon.dao.PaymentDao;
import com.emergon.model.Payment;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/* @author emergon */
@Transactional
@Service
public class PaymentServiceImpl implements PaymentService{

    @Autowired
    private PaymentDao dao;
    
    @Override
    public List<Payment> findAll() {
        return dao.findAll();
    }

    @Override
    public Payment findById(int id) {
        return dao.findById(id);
    }

}