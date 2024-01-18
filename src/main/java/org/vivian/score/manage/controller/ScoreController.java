package org.vivian.score.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.vivian.score.manage.service.ScoreService;

import java.util.Date;

@RestController
@RequestMapping("/score/")
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    @GetMapping("/avgScore")
    public double averageScore(int clazzNo, int courseNo, Date examTime){
        return scoreService.getAverageScore(clazzNo, courseNo, examTime);
    }

    @GetMapping("/medScore")
    public double MedianScore(int clazzNo, int courseNo, Date examTime){
        return 0;
    }

}
