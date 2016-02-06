package ua.artcode.university.controller;

import ua.artcode.university.controller.IGroupController;
import ua.artcode.university.model.additional.sort.HumanBirthDayComporator;
import ua.artcode.university.model.common.Address;
import ua.artcode.university.model.role.Student;

import java.util.ArrayList;
import java.util.Arrays;


public class GroupControllerImpl implements IGroupController {

    private String groupName;
    private ArrayList<Student> students = new ArrayList<>();


    public GroupControllerImpl(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public void addStudent(Student greenStudent){
        students.add(greenStudent);
    }

    @Override
    public Student deleteLastStudent(){
        return students.remove(students.size() - 1);
    }

    @Override
    public Student findById(String id){
        if(id == null){
            System.err.println("id is null");
            return null;
        }

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if(student.getIdNum().equals(id)){
                return student;
            }
        }

        System.err.println("No student found");
        return null;
    }

    @Override
    public Student[] filterByName(String name){
        ArrayList<Student> res = new ArrayList<>();

        int curr = 0;
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if(student.getName().equals(name)){
                res.add(student);
            }
        }

        return res.toArray(new Student[res.size()]);
    }

    @Override
    public Student[] filterByCity(String city){
        ArrayList<Student> res = new ArrayList<>();

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            Address address = student.getAddress();
            if(address != null && address.getCity().equals(city)){
                res.add(student);
            }
        }

        return toArr(res);
    }

    @Override
    public String asString(){
        String res = "GROUP NAME " + groupName +
                "\n"+ "Count " + students.size() + "\n";

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            res += student.toString() + "\n";
        }


        return res;
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public int getSize(){
        return students.size();
    }

    @Override
    public Student[] sortByName() {
        Student[] forSort = toArr(students);

        Arrays.sort(forSort);

        return forSort;
    }

    @Override
    public Student[] sortByDate() {
        Student[] forSort = toArr(students);

        Arrays.sort(forSort, new HumanBirthDayComporator());

        return forSort;
    }

    @Override
    public Student[] toArr(ArrayList<Student> al){
        return al.toArray(new Student[al.size()]);
    }

}
