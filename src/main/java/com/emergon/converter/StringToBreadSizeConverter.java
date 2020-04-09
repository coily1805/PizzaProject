/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergon.converter;

import com.emergon.model.BreadSize;
import com.emergon.service.BreadSizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/* @author emergon */
@Component
public class StringToBreadSizeConverter implements Converter<String, BreadSize>{

    @Autowired
    private BreadSizeService service;
    
    @Override
    public BreadSize convert(String source) {
        int id = Integer.parseInt(source);
        BreadSize breadSize = service.findById(id);
        return breadSize;
    }

}