package com.clickheat.dao;

import com.clickheat.entity.Visit;
import com.clickheat.entity.VisitResponse;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public interface VisitDao {
    void save(Visit visit);
    public List<VisitResponse> getAllVisits();
    public Long getVisitCount();
}
