package com.example.task.service;

import com.example.task.entity.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> findAll();
    Department findById(int id);
    void save(Department department);
    void deleteById(int id);
}
