package com.clickheat.rest;

import com.clickheat.entity.Visit;
import com.clickheat.entity.VisitResponse;
import com.clickheat.service.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class VisitRestController {
    private VisitService visitService;
    @Autowired
    public VisitRestController(VisitService visitService){
        this.visitService = visitService;
    }
    @PostMapping("/visit")
    public String addNewVisit(@RequestBody Visit visit){
        try {
            visitService.addNewVisit(visit);
        } catch (Exception e){
            throw new RuntimeException(e);
        }
        return "Success";
    }

    @GetMapping("/visit")
    public List<VisitResponse> getAllVisits(){
        List<VisitResponse> visits = visitService.getAllVisits();
        return visits;
    }
}
