package org.rohiniinfotech;

import org.rohiniinfotech.Employee.Project;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext1.xml");
        Project p=context.getBean("pro1",Project.class);
        p.display();
    }
}