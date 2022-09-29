package com.eep.grat.report.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JobCodeStatus {
    public String jobid;
    public List<ProfileIdStatus> profileIdStatusList;
}
