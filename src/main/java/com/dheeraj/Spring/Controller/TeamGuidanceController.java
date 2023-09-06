package com.dheeraj.Spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.dheeraj.Spring.Entity.TeamGuidance;
import com.dheeraj.Spring.Service.TeamGuidanceService;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TeamGuidanceController {

	 @Autowired
     TeamGuidanceService teamGuidanceService;

   
   

    @PostMapping("/insertTeamGuidance")
    public TeamGuidance insertTeamGuidance(@RequestBody TeamGuidance teamGuidance) {
        return teamGuidanceService.insertTeamGuidance(teamGuidance);
    }

    @GetMapping("/getAllTeamGuidance")
    public List<TeamGuidance> getAllTeamGuidance() {
        return teamGuidanceService.getAllTeamGuidance();
    }
}

