package com.clickheat.dao;

import com.clickheat.entity.Visit;
import com.clickheat.entity.VisitResponse;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class VisitImpl implements VisitDao{
    private EntityManager entityManager;
    @Autowired
    public VisitImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }
    @Override
    public void save(Visit visit){
        entityManager.persist(visit);
    }
    @Override
    public List<VisitResponse> getAllVisits(){
        String queryString = "SELECT v.date, COUNT(v) " +
                "FROM Visit v " +
                "GROUP BY v.date";
        Query q = entityManager.createQuery(queryString);
        List<Object[]> results = q.getResultList();
        List<VisitResponse> dateCountList = new ArrayList<>();

        for (Object[] result : results) {
            Date date = (Date) result[0];
            Long count = (Long) result[1];
            dateCountList.add(new VisitResponse(date, Math.toIntExact(count)));
        }
        return dateCountList;
    }
}
