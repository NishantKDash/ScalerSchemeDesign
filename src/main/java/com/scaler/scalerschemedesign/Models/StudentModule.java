//package com.scaler.scalerschemedesign.Models;
//
//import javax.persistence.Entity;
//import javax.persistence.ManyToOne;
//
//@Entity
//public class StudentModule extends BaseModel {
//
//    @ManyToOne
//    private Student student;
//    @ManyToOne
//    private Modules module;
//}

//SM : S
// 1 : 1
//S  : SM
// 1  : M

// SM : M
// 1 : 1
// M : SM
// 1 : M

//This class does not have any attribute and is not really part of any other relationship . Therefore, we can
//actually delete this class.
//But how do we actually store this relationship , Because it is a valid relationship, WE can store it as a
// list of modules in class Student.