/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergon.converter;

import com.emergon.model.Ingredient;
import com.emergon.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/* @author emergon */
@Component
public class StringToIngredientConverter implements Converter<String , Ingredient>{

    @Autowired
    private IngredientService service;
    
    @Override
    public Ingredient convert(String source) {
        int id = Integer.parseInt(source);
        return service.findById(id);
    }

}