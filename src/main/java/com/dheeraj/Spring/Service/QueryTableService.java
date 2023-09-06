package com.dheeraj.Spring.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dheeraj.Spring.Entity.QueryTable;
import com.dheeraj.Spring.Repository.QueryTableRepository;

import java.util.List;

@Service
public class QueryTableService {

	
	   @Autowired
     QueryTableRepository queryTableRepository;
    

    public QueryTable addQuery(QueryTable query) {
        return queryTableRepository.save(query);
    }

    public List<QueryTable> getAllQueries() {
        return queryTableRepository.findAll();
    }
}

