package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentService {
    private final Map<String, Student> students = new HashMap<>();

    public void subscribeStudent(Student student) {
        students.put(student.getId(), student);
    }

    public Student findStudent(String studentId) {
        if (students.containsKey(studentId)) {
            return students.get(studentId);
        }
        return null;
    }


    public void showSummary() {
        //TODO implement
        System.out.println("List of Students:");
        //Enhanced for loop for the students
        for (String key : students.keySet()) {
            Student student = students.get(key);
            System.out.print(student);
            //System.out.println(student.isAttendingCourse(key) );
        }
            //  List<Course> courseList = enrolledStudents.get(student.getId());
//Print out the student information
//System.out.println("COURSES");
// CourseService course = new CourseService();
    }

    public void enrollToCourse(String studentId, Course course) {
        if (students.containsKey(studentId)) {
            students.get(studentId).enrollToCourse(course);
        }
    }

}
