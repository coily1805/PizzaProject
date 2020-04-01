package com.emergon.dao;

import com.emergon.model.Ingredient;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author user
 */
@Repository
public class IngredientDaoImpl implements IngredientDao{

    @Override
    public List<Ingredient> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
