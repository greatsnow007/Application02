package com.bxw.model;

/**
 * Created by baixuewei on 2017/7/10.
 */

public class Person {
    private  String Name ;
    private  String Salary;
    private  String Tel;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String salary) {
        Salary = salary;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }


    public Person(String tel, String name, String salary) {
        Tel = tel;
        Name = name;
        Salary = salary;
    }



}
