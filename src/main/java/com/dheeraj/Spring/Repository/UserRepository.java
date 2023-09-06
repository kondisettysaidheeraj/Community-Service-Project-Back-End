package com.dheeraj.Spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dheeraj.Spring.Entity.User;


@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

	User findByuserEmail(String email);


}
