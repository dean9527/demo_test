package org.vivian.score.manage.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Student {
    private int studentNo;
    private int clazzNo;
    private String studentName;
    private int age;
}
