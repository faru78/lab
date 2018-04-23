package controller;

import data.model.Student;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
@ManagedBean(name = "StudentController")
@SessionScoped
public class StudentController {
    private Student student = new Student();

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    public String isNextPage(){
        return "viewstudent";
    }
}
