package javaClasses;

import java.util.Date;

public class Student {

    int id;
    String lastName;
    String firstName;
    String patronymic;
    Date birthDay;
    String address;
    String phoneNumber;
    String department;
    String course;
    String group;

    public Student() {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }
    public Student(int id) {
        this.id = id;
    }

    public Student(String department) {
        this.department = department;
    }

    public Student(int id, String lastName, String firstName, String patronymic, Date birthDay, String address,
                   String phoneNumber, String department, String course, String group) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.birthDay = birthDay;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.department = department;
        this.course = course;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthDay=" + birthDay +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", department='" + department + '\'' +
                ", course='" + course + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
