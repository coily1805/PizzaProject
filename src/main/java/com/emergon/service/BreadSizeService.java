package com.emergon.service;

import com.emergon.model.BreadSize;
import java.util.List;

public interface BreadSizeService {
    
    List<BreadSize> findAll();
    public BreadSize findById(int id);
}
