package ua.artcode.university.test;

import ua.artcode.university.controller.GroupControllerImpl;
import ua.artcode.university.controller.IGroupController;
import ua.artcode.university.controller.MyRefactoredGroupController;
import ua.artcode.university.model.GroupModel;
import ua.artcode.university.model.common.Address;
import ua.artcode.university.model.common.Contact;
import ua.artcode.university.model.common.MyDate;
import ua.artcode.university.model.role.Student;

import java.util.Arrays;

/**
 * Created by serhii on 23.01.16.
 */
public class TestGroup {


    public static void main(String[] args) {
        MyDate myDate = new MyDate(1990, 7, 12);

        Student student1 =
                new Student("Oleg", myDate,
                        new Address("UA", "Kiev", "peremogy sqr", 34),
                        new Contact("+343434334", null));
        Student student2 =
                new Student("Oleg", myDate,
                        new Address("UA", "Odessa", "derebasovskaya st", 2),
                        new Contact("+34300000", null));


        IGroupController group = new MyRefactoredGroupController(new GroupModel("TestGroupModel" , 0));

        group.addStudent(student1);
        group.addStudent(student2);
        System.out.println(group.asString());

        System.out.println();
        System.out.println((group.getSize() == 2) + " addStudent");

        Student found = group.findById(student1.getIdNum());
        System.out.println((found != null) + " findById");

        Student[] filteredByCity = group.filterByCity("Kiev");
        System.out.println((filteredByCity != null && filteredByCity.length == 1) + " filterByCity");

        Student[] filteredByName = group.filterByName("Oleg");
        System.out.println((filteredByName != null && filteredByName.length == 2) + " filterByName");

        group.deleteLastStudent();
        System.out.println((group.getSize() == 1) + " deleteLast");
        System.out.println();


        sortNameTest();

        sortDateTest();

    }

    private static void sortNameTest() {
        Student[] masForSort = {
                new Student("Oleg", new MyDate(1987,6,13),
                        new Address("UA", "Kiev", "peremogy sqr", 34),
                        new Contact("+343434334", null)),
                new Student("Andrey", new MyDate(1990,12,22),
                        new Address("UA", "Odessa", "derebasovskaya st", 2), new Contact("+34300000", null)),
                new Student("Serhii", new MyDate(1970,4,23),
                        new Address("UA", "Odessa", "derebasovskaya st", 2),
                        new Contact("+34300000", null))};

        IGroupController forSort = new GroupControllerImpl("my");
        for (int i = 0; i < masForSort.length; i++) {
            forSort.addStudent(masForSort[i]);
        }

        Student[] sorted = forSort.sortByName();
        System.out.println(Arrays.toString(sorted));
    }

    private static void sortDateTest() {
        Student[] masForSort = {
                new Student("Oleg", new MyDate(1987,6,13),
                        new Address("UA", "Kiev", "peremogy sqr", 34),
                        new Contact("+343434334", null)),
                new Student("Andrey", new MyDate(1990,12,22),
                        new Address("UA", "Odessa", "derebasovskaya st", 2), new Contact("+34300000", null)),
                new Student("Serhii", new MyDate(1970,4,23),
                        new Address("UA", "Odessa", "derebasovskaya st", 2),
                        new Contact("+34300000", null))};

        IGroupController forSort = new GroupControllerImpl("my");
        for (int i = 0; i < masForSort.length; i++) {
            forSort.addStudent(masForSort[i]);
        }

        Student[] sorted = forSort.sortByDate();
        System.out.println(Arrays.toString(sorted));
    }

    /*private static void testAddStudent(){

    }*/
}
