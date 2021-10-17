package exercise5;
/**
 * The Course class holds title and has a relation with CourseRecords
 * @version 1.0.0
 * @since 10/14/2021
 * @author shashank_indukuri
 * DePaul University
 * Copyright (c) 2021
 */

import java.util.ArrayList;
import java.util.Enumeration;

public class Course {
    private String title;
    private ArrayList<CourseRecord> courseRecords;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addCourseRecord(CourseRecord courseRecord) {

    }

    public Enumeration getCourseRecords() {
        //logic to be implemented
        return null;
    }

    public void printCourseStudents() {

    }

    public void printBestStudent() {

    }

    public void printFinalExamStudents() {

    }

}
