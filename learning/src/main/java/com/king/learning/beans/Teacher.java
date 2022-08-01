package com.king.learning.beans;

import lombok.Data;

/**
 * @author king
 * @version 1.0
 * @className Teacher
 * @description TODO
 * @date 2022/5/14
 */
@Data
public class Teacher extends Person {

    /**
     * 教师类型
     */
    private String teacherType;

    /**
     * 教师级别
     */
    private String teacherLevel;

    /**
     * 学校信息
     */
    private School school;

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", birthDate=" + birthDate +
                ", location='" + location + '\'' +
                ", teacherType='" + teacherType + '\'' +
                ", teacherLevel='" + teacherLevel + '\'' +
                ", mySchool=" + school +
                '}';
    }
}
