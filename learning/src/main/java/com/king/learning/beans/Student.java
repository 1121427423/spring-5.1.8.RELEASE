package com.king.learning.beans;

import lombok.Data;

/**
 * @author king
 * @version 1.0
 * @className Student
 * @description TODO
 * @date 2022/5/14
 */
@Data
public class Student extends Person {
    /**
     * 年级
     */
    private String classLevel;

    /**
     * 班主任
     */
    private Teacher teacher;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", birthDate=" + birthDate +
                ", location='" + location + '\'' +
                ", classLevel='" + classLevel + '\'' +
                ", teacher=" + teacher +
                '}';
    }


}
