package com.dheeraj.Spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dheeraj.Spring.Entity.TeamMembers;

@Repository
public interface TeamMembersRepo extends JpaRepository<TeamMembers,Integer> {

	

}
