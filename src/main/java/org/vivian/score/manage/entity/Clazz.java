package org.vivian.score.manage.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table
public class Clazz {
    private int clazzNo;
    private String clazzName;
}
