/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergon.dao;

import com.emergon.model.Payment;
import java.util.List;

/* @author emergon */
public interface PaymentDao {

    List<Payment> findAll();

    public Payment findById(int id);
    
}