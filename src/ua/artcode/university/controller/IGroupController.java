package ua.artcode.university.controller;

import ua.artcode.university.model.role.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by serhii on 06.02.16.
 */
public interface IGroupController {
    void addStudent(Student greenStudent);

    Student deleteLastStudent();

    Student findById(String id);

    Student[] filterByName(String name);

    Student[] filterByCity(String city);

    String asString();

    int getSize();

    Student[] sortByName();

    Student[] sortByDate();

    Student[] toArr(List<Student> al);

    void saveToFile(String path);
}
