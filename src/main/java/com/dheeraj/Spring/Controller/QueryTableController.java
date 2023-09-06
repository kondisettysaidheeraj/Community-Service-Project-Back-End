package com.dheeraj.Spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dheeraj.Spring.Entity.QueryTable;
import com.dheeraj.Spring.Service.QueryTableService;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
class QueryTableController {

	  @Autowired
   QueryTableService queryTableService;

  
  

    @PostMapping("/addQuery")
    public QueryTable addQuery(@RequestBody QueryTable query) {
        return queryTableService.addQuery(query);
    }

    @GetMapping("/getAllQuerys")
    public List<QueryTable> getAllQueries() {
        return queryTableService.getAllQueries();
    }
}
