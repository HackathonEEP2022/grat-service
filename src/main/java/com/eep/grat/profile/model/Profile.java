package com.eep.grat.profile.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Profile {
    String userName;
    String designation;
    String jobCode;
    Date dateOfBirth;
    String govtId;
    List<String> skills;
    double experience;
    String GCB;
    String nationality;

}
