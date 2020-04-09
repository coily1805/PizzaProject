package com.emergon.dao;

import com.emergon.model.Ingredient;
import java.util.List;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author user
 */
@Repository
public class IngredientDaoImpl extends SuperDao implements IngredientDao{

    @Override
    public List<Ingredient> findAll() {
        Query q = getSession().createNamedQuery("Ingredient.findAll");
        List<Ingredient> list = q.getResultList();
        return list;
    }

    @Override
    public Ingredient findById(int id) {
        Query q = getSession().createNamedQuery("Ingredient.findById");
        q.setParameter("id", id);
        Ingredient i = (Ingredient) q.getSingleResult();
        return i;
    }

}
