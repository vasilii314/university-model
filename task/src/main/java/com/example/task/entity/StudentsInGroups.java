package com.example.task.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "students_in_groups")
public class StudentsInGroups {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private HumanInUniversity student;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;

    @OneToMany(mappedBy = "student")
    private List<StudentGrade> grades;

    public StudentsInGroups() {
    }

    public StudentsInGroups(HumanInUniversity student, Group group) {
        this.student = student;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HumanInUniversity getStudent() {
        return student;
    }

    public void setStudent(HumanInUniversity student) {
        this.student = student;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public List<StudentGrade> getGrades() {
        return grades;
    }

    public void setGrades(List<StudentGrade> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "StudentsInGroups{" +
                "id=" + id +
                ", student=" + student +
                ", group=" + group +
                '}';
    }
}
