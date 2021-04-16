package com.example.task.service;

import com.example.task.entity.School;
import com.example.task.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SchoolServiceImpl implements SchoolService {

    private SchoolRepository schoolRepository;

    @Autowired
    public SchoolServiceImpl(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    @Override
    public List<School> findAll() {
        return schoolRepository.findAll();
    }

    @Override
    public School findById(int id) {
        Optional<School> result = schoolRepository.findById(id);
        School school = null;
        if (result.isPresent()) {
            school = result.get();
        } else {
            throw new RuntimeException("School with id " + id + " not found");
        }
        return school;
    }

    @Override
    public void save(School school) {
        schoolRepository.save(school);
    }

    @Override
    public void deleteById(int id) {
        schoolRepository.deleteById(id);
    }
}
