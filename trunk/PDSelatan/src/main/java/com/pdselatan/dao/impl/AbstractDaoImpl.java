package com.pdselatan.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;

import com.pdselatan.dao.AbstractDao;

public abstract class AbstractDaoImpl<E, I extends Serializable> implements AbstractDao<E,I> {

    private Class<E> entityClass;

    protected AbstractDaoImpl(Class<E> entityClass) {
        this.entityClass = entityClass;
    }

    @Autowired
    private SessionFactory sessionFactory;

    public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    @SuppressWarnings("unchecked")
	public E findById(I id) {
        return (E) getCurrentSession().get(entityClass, id);
    }

    public void saveOrUpdate(E e) {
        getCurrentSession().saveOrUpdate(e);
    }

    public void delete(E e) {
        getCurrentSession().delete(e);
    }

    public List<E> findByCriteria(Criterion criterion) {
        Criteria criteria = getCurrentSession().createCriteria(entityClass);
        criteria.add(criterion);
        return criteria.list();
    }
    

    public List<E> findByCriterias(List<Criterion> criterions) {
        Criteria criteria = getCurrentSession().createCriteria(entityClass);
        for(Criterion criterion : criterions){
            criteria.add(criterion);
        }
        return criteria.list();
    }
    
    public List<E> findByHQL(StringBuilder hql){
    	return getCurrentSession().createQuery(hql.toString()).list();
    }
}
