package org.vivian.score.manage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.vivian.score.manage.entity.Score;
import org.vivian.score.manage.repository.ScoreRepository;
import org.vivian.score.manage.repository.ScoreRepsitory2;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * - 可以重点实现一个统计学校某班级、某课程、某次考试成绩中位数、平均数的功能；
 * - 可以列出各科目各班级某次考试成绩中位数的比较总表。
 */
@Service
public class ScoreService {

    @Autowired
    private ScoreRepsitory2 scoreRepository;

    @Cacheable("score")
    public double getAverageScore(int clazzNo, int courseNo, Date examTime){
        List<Score> scoreList = scoreRepository.findByClazzNoAndCourseNoAndExamTime(clazzNo,courseNo,examTime);
        return scoreList.parallelStream().collect(
                        Collectors.averagingInt(x -> x == null ? 0 : x.getScore()));
    }

    @Cacheable("score")
    public double getMedianScore(int clazzNo,int courseNo,Date examTime){
        List<Score> scoreList = scoreRepository.findByClazzNoAndCourseNoAndExamTime(clazzNo,courseNo,examTime);
        List<Integer> scores = scoreList.stream().map(Score::getScore).sorted().collect(Collectors.toList());
        int size = scores.size();
        if(size % 2 == 0){
            return (double) (scores.get(size/2 -2)+scores.get(size/2)) / 2;
        }else{
            return scores.get(size/2);
        }
    }
}
