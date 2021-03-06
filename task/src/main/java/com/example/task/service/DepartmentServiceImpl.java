package com.example.task.service;

import com.example.task.entity.Department;
import com.example.task.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public List<Department> findAll() {
        return departmentRepository.findAll();
    }

    @Override
    public Department findById(int id) {
        Optional<Department> result = departmentRepository.findById(id);
        Department department = null;
        if (result.isPresent()) {
            department = result.get();
        } else {
            throw new RuntimeException("Employee with id " + id + " not found");
        }
        return department;
    }

    @Override
    public void save(Department department) {
        departmentRepository.save(department);
    }

    @Override
    public void deleteById(int id) {
        departmentRepository.deleteById(id);
    }
}
