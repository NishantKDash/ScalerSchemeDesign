package com.scaler.scalerschemedesign.Models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class StudentModuleExam extends BaseModel {
    @ManyToOne
    private Student student;
    @ManyToOne
    private ModuleExam moduleExam;

    private int marks;

}

//SME : S
// 1 : 1
// S : SME
// 1  : M

// SME : ME
// 1 : 1
// ME : SME
// 1  : M
// I have an object with ME id = 21
// For that module that can be given by M students