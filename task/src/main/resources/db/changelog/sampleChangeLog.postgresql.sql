-- liquibase formatted sql

-- changeset admin:1
CREATE TABLE roles (
    id SERIAL PRIMARY KEY,
    role_description VARCHAR(50)
);

-- changeset admin:2
CREATE TABLE course_type (
    id SERIAL PRIMARY KEY,
    type VARCHAR (50)
);

-- changeset admin:3
INSERT INTO roles(role_description) VALUES
('STUDENT'),
('PROFESSOR'),
('POSTGRADUATE');

-- changeset admin:4
INSERT INTO course_type(type) VALUES
('SOCIAL'),
('MATHEMATICAL');



