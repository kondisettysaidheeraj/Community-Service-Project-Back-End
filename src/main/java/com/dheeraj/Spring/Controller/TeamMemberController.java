package com.dheeraj.Spring.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.dheeraj.Spring.Entity.TeamMembers;
import com.dheeraj.Spring.Service.TeamMembersService;

import java.util.List; // Import the correct List class from java.util

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TeamMemberController {
    @Autowired
    TeamMembersService tm;
    
    @PostMapping("/strTeamMembersData") 
    public TeamMembers store(@RequestBody TeamMembers data) {
        return tm.store(data);
    }
    
    @GetMapping("/getTeamMembersData") 
    public List<TeamMembers> getTeamMembersData() {
        return tm.getAllTeamMembers();
    }
}
