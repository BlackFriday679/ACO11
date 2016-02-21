package ua.artcode.university.controller;

import ua.artcode.university.model.GroupModel;
import ua.artcode.university.model.role.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by serhii on 06.02.16.
 */
public class MyRefactoredGroupController implements IGroupController {

    private GroupModel groupModel;

    public MyRefactoredGroupController(GroupModel groupModel) {
        this.groupModel = groupModel;
    }

    @Override
    public void addStudent(Student greenStudent) {
        groupModel.getStudents().add(greenStudent);
    }

    @Override
    public Student deleteLastStudent() {
        List<Student> studentList = groupModel.getStudents();
        return studentList.remove(studentList.size() - 1);
    }

    @Override
    public Student findById(String id) {
        // -1
        int index = groupModel.getStudents().indexOf(new Student());
        return /*groupModel.getStudents().get(index)*/null;
    }

    @Override
    public Student[] filterByName(String name) {
        return new Student[0];
    }

    @Override
    public Student[] filterByCity(String city) {
        return new Student[0];
    }

    @Override
    public String asString() {
        return Arrays.toString(groupModel.getStudents().toArray());
    }

    @Override
    public int getSize() {
        return groupModel.getCount();
    }

    @Override
    public Student[] sortByName() {
        return new Student[0];
    }

    @Override
    public Student[] sortByDate() {
        return new Student[0];
    }

    @Override
    public Student[] toArr(List<Student> al) {
        return new Student[0];
    }

    @Override
    public void saveToFile(String path) {

    }

}
