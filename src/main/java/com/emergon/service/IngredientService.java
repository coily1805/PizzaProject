package com.emergon.service;

import com.emergon.model.Ingredient;
import java.util.List;

public interface IngredientService {

    public List<Ingredient> findAll();

    public Ingredient findById(int id);
}
