package com.example.task.controller;

import com.example.task.entity.Department;
import com.example.task.entity.Human;
import com.example.task.entity.School;
import com.example.task.service.HumanService;
import com.example.task.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TestController {

    private HumanService humanService;
    private SchoolService schoolService;


    @Autowired
    public TestController(HumanService humanService, SchoolService schoolService) {
        this.humanService = humanService;
        this.schoolService = schoolService;
    }


    @GetMapping("/hello")
    public String sayHello() {
        return "Hello";
    }

    @PostMapping("/add")
    public void addEmployee() {
        Human human = new Human("Cressida Wells", new Date());
        humanService.save(human);
    }

    @PostMapping("/addschool")
    public void addSchool() {
        School school = new School("Brisbane School Of Mathematics");
        List<Department> departments = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            departments.add(new Department("department" + (i + 1), school));
        }
        school.setDepartments(departments);
        schoolService.save(school);
    }
}
