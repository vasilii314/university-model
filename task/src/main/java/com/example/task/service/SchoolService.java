package com.example.task.service;

import com.example.task.entity.School;

import java.util.List;

public interface SchoolService {
    List<School> findAll();
    School findById(int id);
    void save(School school);
    void deleteById(int id);
}
