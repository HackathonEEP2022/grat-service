package com.eep.grat.assessment.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QuestionModel {

    public int id;
    public String question;
    public String optionA;
    public String optionB;
    public String optionC;
    public String optionD;
    public String optionAnswer;
    public String skill;
    public String Competency;
}
