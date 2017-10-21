package com.example.android.oceansdaughter;

/**
 * Created by Quoc on 10/20/2017.
 */

public class Student {


    private String studentName;
    private String grade;
    private String className;
    Student(String studentName, String grade, String className)
    {
        this.studentName = studentName;
        this.grade = grade;
        this.className = className;
    }
    public String getStudentName() {
        return studentName;
    }

    public String getGrade() {
        return grade;
    }

    public String getClassName() {
        return className;
    }
}
