package com.emergon.service;

import com.emergon.dao.IngredientDao;
import com.emergon.model.Ingredient;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class IngredientServiceImpl implements IngredientService{

    @Autowired
    private IngredientDao dao;
    
    @Override
    public List<Ingredient> findAll() {
        return dao.findAll();
    }

    @Override
    public Ingredient findById(int id) {
        return dao.findById(id);
    }
    
}
