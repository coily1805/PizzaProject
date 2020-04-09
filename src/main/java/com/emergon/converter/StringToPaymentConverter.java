/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergon.converter;

import com.emergon.model.Payment;
import com.emergon.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/* @author emergon */
@Component
public class StringToPaymentConverter implements Converter<String, Payment>{

    @Autowired
    private PaymentService service;
    
    @Override
    public Payment convert(String source) {
        int id = Integer.parseInt(source);
        return service.findById(id);
    }

}