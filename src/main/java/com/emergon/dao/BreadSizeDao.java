package com.emergon.dao;

import com.emergon.model.BreadSize;
import java.util.List;

public interface BreadSizeDao {
    
    List<BreadSize> findAll();

    public BreadSize findById(int id);
    
}
