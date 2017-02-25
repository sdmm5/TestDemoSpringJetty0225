package com.ptteng.dao;

import com.ptteng.entity.Employee;

import java.util.List;

/**
 * Created by maweijiang on 2017/2/25.
 */
public interface EmployeeDao {
    public void addEmployee(Employee e);
    public void updateEmployee(Employee e);
    public void deleteEmployee(int id);
    public List<Employee> getAllEmployee();
    public Employee getById(int id);
}
