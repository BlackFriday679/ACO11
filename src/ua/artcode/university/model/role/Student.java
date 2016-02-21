package ua.artcode.university.model.role;

/*
*
* учиться
   		добавить предмет
   		удалить предмет из списка последний
   		показать всю информацию о предметах
        получить средний бал за все предметы
*
*
* */

import ua.artcode.university.model.common.Address;
import ua.artcode.university.model.common.Contact;
import ua.artcode.university.model.common.MyDate;
import ua.artcode.world.role.IAlcoholic;
import ua.artcode.world.role.IShooter;
import ua.artcode.world.role.ISportsman;

import javax.security.auth.Subject;
import java.io.Serializable;

public class Student extends Human implements Serializable,Comparable<Student>, IShooter, ISportsman, IAlcoholic {

    private static double monthMoney = 790;
    private static int idCounter = 0;
    private String idNum;
    private int rank;

    public Student() {
    }

    public Student(String idNum) {
        this.idNum = idNum;
    }

    // run before constructors
    {
        this.idNum = String.valueOf(idCounter);
        idCounter++;
    }

    public Student(String name, int rank) {
        super.setName(name);
        this.rank = rank;
    }

    public Student(String name, MyDate birthday,
                   Address address, Contact contact) {
        setName(name);
        setBirthday(birthday);
        setAddress(address);
        setContact(contact);
    }


    public Subject getSubject(String subjId) {
        return null;
    }


    public static double getMonthMoney() {
        return monthMoney;
    }

    public String getIdNum() {
        return idNum;
    }


    public int getRank() {
        return rank;
    }


    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }


    public void setRank(int rank) {
        this.rank = rank;
    }

    public String toString() {
        return String.format("id %s, name %s, birthday %s, address %s",
                idNum, getName(), getBirthday().asString(), getAddress().asString());
    }

    public boolean addSubject(Subject subject) {
        // SubjectFactory.createSubject(subjId);
        return false;
    }

    public int subjectsCount() {
        return 0;
    }

    public Subject[] getSubjects() {
        return null;
    }

    public int averageMark() {
        return 0;
    }

    /*
    *
    * @return total subject studied hours
    *
    * */
    public int learn(String subjectId, int hours) {
        return 0;
    }

    @Override
    public void drink() {
        System.out.println("student drink");
    }

    @Override
    public void shoot() {
        System.out.println("student shoot");
    }

    @Override
    public void doExercise() {
        System.out.println("student jump");
    }

    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }
}
