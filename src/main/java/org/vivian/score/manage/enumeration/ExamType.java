package org.vivian.score.manage.enumeration;

import lombok.Getter;

@Getter
public enum ExamType {
    MIDTERM(1), FINALTERM(2);

    private ExamType(int value){
        this.value=value;
    }

    private int value;

}
