package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;


import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class WhiskyRepositoryImpl implements WhiskyRepositoryCustom {

//    @Autowired
//    EntityManager entityManager;
//
//    @Transactional
//    public List<Whisky> getWhiskyByDistilleryIdAndWhiskyYear(Long distilleryId, Integer year){
//        List<Whisky> result = null;
//
//        Session session = entityManager.unwrap(Session.class);
//
//        try{
//            //this code may not work
////            CriteriaBuilder builder = session.getCriteriaBuilder();
////            CriteriaQuery<Distillery> criteria = builder.createQuery(Distillery.class);
////            criteria.
//
//            Criteria criteria = session.createCriteria(Whisky.class);
//
//            criteria.createAlias("whiskies", "whiskyAlias");
//            criteria.add( Restrictions.eq("whiskyAlias.year", year) );
//            criteria.add( Restrictions.eq("whiskyAlias.distillery_id", distilleryId));
//
//            result = criteria.list();
//        }
//        catch(HibernateException ex){
//            //stuff went wrong
//            ex.printStackTrace();
//        }
//
//        return result;
//    }

}
