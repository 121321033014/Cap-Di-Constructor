package org.rohiniinfotech.Employee;

public class Project {
    public int projectid;
    public String projectname;
    public String projectCode;
    public String projectmanager;

    public Project(int projectid, String projectname, String projectCode, String projectmanager) {
        this.projectid = projectid;
        this.projectname = projectname;
        this.projectCode = projectCode;
        this.projectmanager = projectmanager;
    }
    public void display(){
        System.out.println("the project details are with Id:"+projectid+"and name of the project:"+projectname+"and the description is :"+projectCode+"and the project manager is"+projectmanager);
    }
}
