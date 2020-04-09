package com.emergon.dao;

import com.emergon.model.BreadSize;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BreadSizeDaoImpl extends SuperDao implements BreadSizeDao {

    @Override
    public List<BreadSize> findAll() {
        Query q = getSession().createNamedQuery("BreadSize.findAll", BreadSize.class);
        List<BreadSize> list = q.getResultList();
        return list;
    }

    @Override
    public BreadSize findById(int id) {
        Query q = getSession().createNamedQuery("BreadSize.findById", BreadSize.class);
        q.setParameter("id", id);
        BreadSize b = (BreadSize)q.getResultList().get(0);
        return b;
    }

}