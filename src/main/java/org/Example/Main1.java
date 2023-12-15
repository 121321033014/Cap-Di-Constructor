package org.Example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {
    public static void main(String[] args) {
// Load the Spring context
        ApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");
// Retrieve the StudentService bean
        StudentService studentService = (StudentService)
                context.getBean("studentService");

// Use the bean
       // System.out.println("Student Name: " + studentService.getStudent().getName());
        System.out.println("Student Name: " + studentService.getStudentName());

    }
}
