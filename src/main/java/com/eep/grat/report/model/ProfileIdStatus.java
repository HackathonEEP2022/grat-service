package com.eep.grat.report.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProfileIdStatus {
    public String profileId;
//    public List<QuestionModel> attemptedQuestions;
//    public List<QuestionModel> correctQuestions;
//    public List<QuestionModel> wrongQuestions;

    public int attemptedQuestions;
    public int correctQuestions;
    public int wrongQuestions;
    public String currentStatus;
    public String initialAssessmentResult;

}
