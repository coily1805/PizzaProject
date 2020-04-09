/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergon.service;

import com.emergon.model.Payment;
import java.util.List;

/**
 *
 * @author user
 */
public interface PaymentService {
    public List<Payment> findAll();

    public Payment findById(int id);
}
