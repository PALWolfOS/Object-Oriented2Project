/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2project;

/**
 *
 * @author joshu_000
 */
public class Student {
    private String ID;
    private String name;
    private String semester;
    private String year;
    private String RegCourse;
    
    public Student(){
        this.ID = "";
        this.name = "";
        this.RegCourse = "";
        this.semester = "";
        this.year = "";
    }
    public Student(String a, String b, String c, String d, String e){
        this.ID = a;
        this.name = b;
        this.RegCourse = c;
        this.semester = d;
        this.year = e;
    }
    
    public String getCourseID(){
        return this.ID;
    }
    
    public String getSemester(){
        return this.semester;
    }
    
    public String getYear(){
        return this.year;
    }
    
    public String getName(){
        return this.year;
    }
    
    public String getCourse(){
        return this.RegCourse;
    }
}
