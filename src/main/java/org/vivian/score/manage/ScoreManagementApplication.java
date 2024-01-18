package org.vivian.score.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ScoreManagementApplication {
    public static void main( String[] args ) {
        SpringApplication.run(ScoreManagementApplication.class);
    }
}
