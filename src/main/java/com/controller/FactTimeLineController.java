package com.controller;

import com.model.Test;
import com.repository.FactConnectTimeLineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@CrossOrigin(origins = "*")
@RestController
public class FactTimeLineController {
    private FactConnectTimeLineRepository timeLineService;
    @Autowired
    public FactTimeLineController(FactConnectTimeLineRepository timeLineService) {
        this.timeLineService=timeLineService;
    }


    @RequestMapping (method = RequestMethod.GET, value = "/products",produces= MediaType.APPLICATION_JSON_VALUE)
    public List<Test> findTimesLines() {
        List<Test> timelines=new ArrayList<Test>();
        timeLineService.findAll().forEach(timelines::add);
        return timelines;

    }

}
