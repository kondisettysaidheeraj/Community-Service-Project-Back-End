package com.dheeraj.Spring.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dheeraj.Spring.Entity.SurveyResponse;
import com.dheeraj.Spring.Repository.SurveyResponseRepository;

import java.util.List;

@Service
public class SurveyResponseService {

   

    @Autowired
    SurveyResponseRepository surveyResponseRepository;
  

    public SurveyResponse insertSurveyResponse(SurveyResponse surveyResponse) {
        return surveyResponseRepository.save(surveyResponse);
    }

    public List<SurveyResponse> getAllSurveyData() {
        return surveyResponseRepository.findAll();
    }
}
