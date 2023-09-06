package com.dheeraj.Spring.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SurveyResponse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String participantName;
    private String sol1;
    private String sol2;
    private String sol3;
    private String sol4;
    private String sol5;
    private String sol6;
    private String sol7;
	public  int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getParticipantName() {
		return participantName;
	}
	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}
	public String getSol1() {
		return sol1;
	}
	public void setSol1(String sol1) {
		this.sol1 = sol1;
	}
	public String getSol2() {
		return sol2;
	}
	public void setSol2(String sol2) {
		this.sol2 = sol2;
	}
	public String getSol3() {
		return sol3;
	}
	public void setSol3(String sol3) {
		this.sol3 = sol3;
	}
	public String getSol4() {
		return sol4;
	}
	public void setSol4(String sol4) {
		this.sol4 = sol4;
	}
	public String getSol5() {
		return sol5;
	}
	public void setSol5(String sol5) {
		this.sol5 = sol5;
	}
	public String getSol6() {
		return sol6;
	}
	public void setSol6(String sol6) {
		this.sol6 = sol6;
	}
	public String getSol7() {
		return sol7;
	}
	public void setSol7(String sol7) {
		this.sol7 = sol7;
	}

   

   
}

