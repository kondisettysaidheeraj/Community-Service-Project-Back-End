package com.dheeraj.Spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dheeraj.Spring.Entity.QueryTable;
 
@Repository
public interface QueryTableRepository extends JpaRepository<QueryTable, Integer> {
    
}
