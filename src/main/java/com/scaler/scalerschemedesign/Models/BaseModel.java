package com.scaler.scalerschemedesign.Models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;
@MappedSuperclass
public abstract class BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Uses the IDENTITY way of created UUIDS in enum generation type like Twitter uses Snowflake to produce UUIDS
    private Long id;
    @CreatedDate
    //By using this annotation , we ask spring to automatically put time in database when object is created
    private Date createdAt;
    @LastModifiedDate//Automatically puts the last time on server
    private Date lastModifiedAt;
}


//ORM- Object Relational Mapping - In our application we have objects , but in database we have relational
//model , an ORM maps an object to a relation behind the scenes.
//Having Auto incremented id can create security problems because anybody can guess
// number of people by getting the largest id
//So in a real database UUID are used - Universally Unique Identifier - this consists of
// multiple parameters like time and it is encoded to create a unique id