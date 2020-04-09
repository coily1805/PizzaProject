/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergon.dao;

import com.emergon.model.Orders;

/**
 *
 * @author user
 */
public interface OrderDao {

    public boolean save(Orders order);

}