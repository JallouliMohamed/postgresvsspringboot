package com.service;

import com.model.Test;
import com.repository.FactConnectTimeLineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public class FactConnectTimeLineService implements IFactConnectTimeLine {
    @Autowired
    private  FactConnectTimeLineRepository repository;
    @Override
    public List<Test> findAll() {
        List<Test> timelines = (List<Test>) repository.findAll();
        return timelines;
    }
}
