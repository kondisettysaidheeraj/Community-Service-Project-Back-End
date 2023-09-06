package com.dheeraj.Spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.dheeraj.Spring.Entity.SurveyResponse;
import com.dheeraj.Spring.Service.SurveyResponseService;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class SurveyResponseController {
   
	   @Autowired
	   SurveyResponseService surveyResponseService;

 
  

    @PostMapping("/insertSurvey")
    public SurveyResponse insertSurveyResponse(@RequestBody SurveyResponse surveyResponse) {
        return surveyResponseService.insertSurveyResponse(surveyResponse);
    }

    @GetMapping("/getAllSurveys")
    public List<SurveyResponse> getAllSurveyData() {
        return surveyResponseService.getAllSurveyData();
    }
}
