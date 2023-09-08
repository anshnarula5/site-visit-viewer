package com.clickheat.service;

import com.clickheat.dao.VisitDao;
import com.clickheat.entity.Visit;
import com.clickheat.entity.VisitResponse;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class VisitService {
    private VisitDao visitDao;
    @Autowired
    public VisitService(VisitDao visitDao){
        this.visitDao = visitDao;
    }
    @Transactional
    public void addNewVisit(Visit visit){
        visitDao.save(visit);
    }
    public List<VisitResponse> getAllVisits(){
        return visitDao.getAllVisits();
    }
}
