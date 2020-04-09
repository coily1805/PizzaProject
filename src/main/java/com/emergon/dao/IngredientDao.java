package com.emergon.dao;

import com.emergon.model.Ingredient;
import java.util.List;

public interface IngredientDao {

    List<Ingredient> findAll();

    public Ingredient findById(int id);
}
