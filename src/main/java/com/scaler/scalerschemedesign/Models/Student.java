package com.scaler.scalerschemedesign.Models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Student extends  BaseModel {

    private String name;
    private String address;
    private String email;
    private String phoneNumber;
    private String password;

    @ManyToMany
    private List<Modules> enrolledModules;
    //Cardinality
    // S : M
    // 1 : m
    //  M : S
    // 1  : M
    //When we run this application, there will be no attribute called enrolledModules, there will be
    // another mapping table made by SpringBoot automatically. We created this attribute here  , as we
    // did not need the Class StudentModule.
}
