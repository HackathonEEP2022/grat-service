package com.eep.grat.assessment.service;

import com.eep.grat.assessment.model.QuestionModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DummyQuestions {

    public List<QuestionModel> ThirtQyestions()
    {
        List<QuestionModel> questions = new ArrayList<>();

        for(int i=0;i<30;i++)
        {
            questions.add(new QuestionModel(i,"What is 2+2 ?","5","6","7","4","D","Mathematics","beginner"));
        }

        return questions;
    }
}
