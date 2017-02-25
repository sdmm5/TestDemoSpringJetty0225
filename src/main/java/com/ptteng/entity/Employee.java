package com.ptteng.entity;

/**
 * Created by maweijiang on 2017/2/25.
 */
public class Employee {
    private int id;
    private String name;
    private double salary;
    private int age;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public String toString(){
        return "id=" + id + "," + "name=" + name + "," + "salary=" + salary + ","+ "age=" +age;
    }

    public Employee(){
        super();
    }

    public Employee(int id,String name,double salary,int age){
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

}
