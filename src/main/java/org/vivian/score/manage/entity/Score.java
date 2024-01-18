package org.vivian.score.manage.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Data
@Builder
@Entity
@Table
public class Score {
    private int clazzNo;
    private int courseNo;
    private int examType;
    private int studentNo;
    private int score;
    private Date examDate;
}
