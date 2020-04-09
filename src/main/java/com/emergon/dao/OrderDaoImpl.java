/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergon.dao;

import com.emergon.model.Orders;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

/**
 *
 * @author user
 */
@Repository
public class OrderDaoImpl extends SuperDao implements OrderDao{

    @Override
    public boolean save(Orders order) {
        Session s = sessionFactory.getCurrentSession();
        s.save(order);
        return true;
    }

}