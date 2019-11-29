package com.company;

public class Student {
    private StringBuilder name;
    private int course;
    private int grade;

    public StringBuilder getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name.length() >= 3){
            this.name = new StringBuilder(name);
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if ((course > 0) && (course < 5)) {
            this.course = course;
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if ((grade > 0) && (grade < 11)) {
            this.grade = grade;
        }
    }

    public Student(String name, int course, int grade){
        setName(name);
        setCourse(course);
        setGrade(grade);
    }

    public void showInfo(){
        System.out.println("course " + this.getCourse());
        System.out.println("grade " + this.getGrade());
        System.out.println("name " + this.getName());
    }
}

class TestClass{
    public static void main(String[] args) {
        Student student = new Student("Vasya", 1, 4);
        student.showInfo();
    }
}
