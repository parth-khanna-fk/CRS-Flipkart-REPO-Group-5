package com.flipkart.service;

import com.flipkart.bean.RegisteredCourse;
import com.flipkart.bean.Student;

import java.util.List;
public interface StudentInterface {
    void register(Student stud);

    public Student fetchStudentData(int id);

    //show gradesheet(print inside the function not return it)
    void viewGradesheet();

    //same goes with this function we show the grades print it not return it


    void viewCourseCatalogue();






    void addCourses(Student stud);

    void dropCourses(Student stud);

    void feePayment();




    void viewCourses(Student stud);
}


