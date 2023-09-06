package com.dheeraj.Spring.Service;

import org.springframework.stereotype.Service;

import com.dheeraj.Spring.Entity.TeamGuidance;
import com.dheeraj.Spring.Repository.TeamGuidanceRepository;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class TeamGuidanceService {

	   @Autowired
    TeamGuidanceRepository teamGuidanceRepository;

 
   

    public TeamGuidance insertTeamGuidance(TeamGuidance teamGuidance) {
        return teamGuidanceRepository.save(teamGuidance);
    }

    public List<TeamGuidance> getAllTeamGuidance() {
        return teamGuidanceRepository.findAll();
    }
}
