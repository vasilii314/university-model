package com.example.task.service;

import com.example.task.entity.Human;

import java.util.List;

public interface HumanService {
    List<Human> findAll();
    Human findById(int id);
    void save(Human human);
    void deleteById(int id);
}
