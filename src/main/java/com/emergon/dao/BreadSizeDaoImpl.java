package com.emergon.dao;

import com.emergon.model.BreadSize;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BreadSizeDaoImpl implements BreadSizeDao{

    @Autowired
    private SessionFactory sessionFactory;
    
    private Session getSession(){
        Session s = sessionFactory.getCurrentSession();
        return s;
    }
    
    @Override
    public List<BreadSize> findAll() {
        Query q = getSession().createNamedQuery("BreadSize.findAll");
        List<BreadSize> list = q.getResultList();
        return list;
    }
    
}
