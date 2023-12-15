package org.Example;



public class StudentService {
    private Student student;


   public StudentService(Student student) {
        this.student = student;
    }

    //public Student getStudent() {
  //      return student;
  //  }

   // public void setStudent(Student student) {
   //     this.student = student;
  //  }
   public String getStudentName() {
       return student.getName();
   }
}
