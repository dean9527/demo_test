package org.vivian.score.manage.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.vivian.score.manage.entity.Clazz;
import org.vivian.score.manage.entity.Score;

import java.util.Date;
import java.util.List;

/**
 * - 可以重点实现一个统计学校某班级、某课程、某次考试成绩中位数、平均数的功能；
 * - 可以列出各科目各班级某次考试成绩中位数的比较总表。
 */
@Repository
public interface ScoreRepository extends PagingAndSortingRepository<Score, Integer> {
    public List<Score> findByClazzNoAndCourseNoAndExamTime(int clazzNo, int courseNo, Date examTime);
}
