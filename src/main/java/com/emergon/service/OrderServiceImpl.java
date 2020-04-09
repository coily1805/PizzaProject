/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergon.service;

import com.emergon.dao.OrderDao;
import com.emergon.model.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/* @author emergon */
@Transactional
@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderDao dao;
    
    @Override
    public boolean save(Orders order) {
        return dao.save(order);
    }

}