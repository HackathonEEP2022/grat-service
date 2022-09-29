package com.eep.grat.notification.controller;


import com.eep.grat.assessment.model.QuestionModel;
import com.eep.grat.profile.model.Profile;
import com.eep.grat.profile.model.ProfileId;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NotificationController {

    @PostMapping("stub/notification")
    public String uploadQuestions(@RequestBody ProfileId profileId){
        System.out.println("Exam done for Profileid" + profileId);
        return "Thank you for completing assessment !";
    }

}
