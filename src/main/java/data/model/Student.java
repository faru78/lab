package data.model;

public class Student {

    private Integer studentId;
    private String studentName;
    public Student() {


    }

    public Integer getStudentId() {

        return studentId;

    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
        System.out.println("roll:1");
    }

    public String getStudentName() {
        return studentName;

    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
        System.out.println("A");
    }
}
