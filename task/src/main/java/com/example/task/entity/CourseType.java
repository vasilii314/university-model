package com.example.task.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "course_type")
public class CourseType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(length = 50)
    private ECourseType type;

    @OneToMany(mappedBy = "courseType")
    private List<Course> courses;

    public CourseType() {
    }

    public CourseType(ECourseType type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ECourseType getType() {
        return type;
    }

    public void setType(ECourseType type) {
        this.type = type;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "CourseType{" +
                "id=" + id +
                ", type=" + type +
                ", courses=" + courses +
                '}';
    }
}
