package com.example.task.entity;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(length = 50)
    private ERole roleDescription;

    @ManyToMany(mappedBy = "roles")
    private List<HumanInUniversity> peopleWithRoles;

    public Role() {
    }

    public Role(ERole roleDescription) {
        this.roleDescription = roleDescription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ERole getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(ERole roleDescription) {
        this.roleDescription = roleDescription;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleDescription=" + roleDescription +
                '}';
    }
}
