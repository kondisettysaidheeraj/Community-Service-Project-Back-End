package com.dheeraj.Spring.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dheeraj.Spring.Entity.TeamMembers;
import com.dheeraj.Spring.Repository.TeamMembersRepo;

import java.util.List; // Import the correct List class from java.util

@Service
public class TeamMembersService {
    @Autowired
    TeamMembersRepo tr;

    public TeamMembers store(TeamMembers data) {
        return tr.save(data);
    }

    public List<TeamMembers> getAllTeamMembers() {
        return tr.findAll();
    }
}
