package com.eep.grat.assessment.controller;

import com.eep.grat.assessment.model.QuestionModel;
import com.eep.grat.assessment.service.DummyQuestions;
import com.eep.grat.profile.model.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class AssessmentController {

    @Autowired
    public DummyQuestions dq;

    @PostMapping("stub/assessment/bulk")
    public String uploadQuestions(@RequestBody List<QuestionModel> newQuestions){
        System.out.println("request for adding new questions to the Question Bank {}" + newQuestions.toString());
        return "successfully uploaded Questions";
    }

    @GetMapping("stub/assessment/{profileid}")
    public List<QuestionModel> getAssessment(@PathVariable("profileid") final Long id){
        System.out.println("Returning a list of 30 questions for profile id -" + id);
        return dq.ThirtQyestions();
    }

    @PostMapping("stub/assessment/{profileid}/submit")
    public String submitAssessment(@RequestBody Profile profile){
        System.out.println("Exam finished for profile "+ profile +" at "+ LocalDateTime.now());
        return "Thank you ! ";
    }

    @PutMapping("stub/assessment/{profileid}")
    public String setTiming(@RequestBody Profile newProfile){
        System.out.println("Generating the assessment Link for " + newProfile.toString());
        return "https://hsbc-grat-assessment.com/"+newProfile.getUserName();
    }


}

