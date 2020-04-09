package com.emergon.service;

import com.emergon.dao.BreadSizeDao;
import com.emergon.model.BreadSize;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class BreadSizeServiceImpl implements BreadSizeService{

    @Autowired
    private BreadSizeDao dao;
    
    @Override
    public List<BreadSize> findAll() {
        return dao.findAll();
    }

    @Override
    public BreadSize findById(int id) {
        return dao.findById(id);
    }
    
}
