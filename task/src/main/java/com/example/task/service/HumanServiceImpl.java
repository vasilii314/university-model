package com.example.task.service;

import com.example.task.entity.Human;
import com.example.task.repository.HumanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HumanServiceImpl implements HumanService {

    private HumanRepository humanRepository;

    @Autowired
    public HumanServiceImpl(HumanRepository humanRepository) {
        this.humanRepository = humanRepository;
    }

    @Override
    public List<Human> findAll() {
        return humanRepository.findAll();
    }

    @Override
    public Human findById(int id) {
        Optional<Human> result = humanRepository.findById(id);
        Human human = null;
        if (result.isPresent()) {
            human = result.get();
        } else {
            throw new RuntimeException("Employee with id " + id + " not found");
        }
        return human;
    }

    @Override
    public void save(Human human) {
        humanRepository.save(human);
    }

    @Override
    public void deleteById(int id) {
        humanRepository.deleteById(id);
    }
}
