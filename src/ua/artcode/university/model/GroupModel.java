package ua.artcode.university.model;

import ua.artcode.university.model.role.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by serhii on 06.02.16.
 */
public class GroupModel {

    private String name;
    private int count;
    private List<Student> students;

    public GroupModel(String name, int count) {
        this.name = name;
        this.count = count;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
