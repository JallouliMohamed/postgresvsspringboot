package com.repository;
import com.model.Test;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FactConnectTimeLineRepository extends CrudRepository<Test, Long> {
    List<Test> findAll();

}
