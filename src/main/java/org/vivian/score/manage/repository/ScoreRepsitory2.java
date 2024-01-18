package org.vivian.score.manage.repository;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.vivian.score.manage.entity.Score;

import java.util.Date;
import java.util.List;

@Repository
public class ScoreRepsitory2 {
    public List<Score> findByClazzNoAndCourseNoAndExamTime(int clazzNo, int courseNo, Date examTime){
        return Lists.newArrayList(
                Score.builder().score(80).clazzNo(1).courseNo(1).build(),
                Score.builder().score(90).clazzNo(2).courseNo(2).build(),
                Score.builder().score(100).clazzNo(3).courseNo(3).build()
                );
    }
}
