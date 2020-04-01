package com.emergon.dao;

import com.emergon.model.Ingredient;
import java.util.List;

public interface IngredientDao {

    public List<Ingredient> findAll();
    
}
