package com.scaler.scalerschemedesign.Models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.util.Date;

@Entity
public class ModuleExam extends  BaseModel{
    @ManyToOne
    private Modules module;
    @ManyToOne
    //ME : E
    // 1 : 1
    // E : M
    // M : 1
    //Example moduleExam objects can be => (2 , 5) , (3 , 5)
    private Exam exam;
    private Date dateOfExam;
}
//if the type of attribute of a class is a data type that is also being persisted we are talking about
// relation between two classes Therefore we must specify the cardinality of the relation so that spring
// boot can create tables appropriately.
//Although ModuleExam is mapping table but there is no way for spring to know that. Therefore,  when we create
// a entity of Mapping table , which has entities of other persistence entity we have to specify the cardinality


//Cardinality between ModuleExam and Modules
// 1 moduleExam is associated with one Module
//(module_id , exam_id) : 1
// But Module can have multiple Exams
//Module with id = 2 has exams with id (5 , 3, 6)
//=> we will have ModuleExam objects like
// (2 , 5)
// (2 , 4)
// (2 , 6)
//Therefore the cardinality for Module to ModuleExam is 1 : m;

