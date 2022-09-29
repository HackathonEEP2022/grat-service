package com.eep.grat.report.controller;

import com.eep.grat.assessment.model.QuestionModel;
import com.eep.grat.report.model.JobCodeStatus;
import com.eep.grat.report.model.ProfileIdStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
public class ReportController {


    @GetMapping("stub/report/{profileid}")
    public String reportProfileid(@PathVariable("profileid") final Long id){
         return new ProfileIdStatus("P00001",10,5,5,"Rejected","Failed").toString();
    }

    @GetMapping("stub/report/{jobcode}")
    public String reportJobCode(@PathVariable("jobcode") final Long id){
        return new JobCodeStatus("J0001",new ArrayList<>((Collection) new ProfileIdStatus("P00001",10,5,5,"Rejected","Failed"))).toString();
    }

}
