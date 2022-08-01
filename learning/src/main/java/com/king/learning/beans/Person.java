package com.king.learning.beans;

import lombok.Data;

import java.util.Date;

/**
 * @author king
 * @version 1.0
 * @className Person
 * @description TODO
 * @date 2022/5/6
 */
@Data
public class Person {

    /**
     * 姓名
     */
    public String name;

    /**
     * 年龄
     */
    public int age;

    /**
     * 性别
     */
    public String sex;

    /**
     * 出生日期
     */
    public Date birthDate;

    /**
     * 出生地
     */
    public String location;

}
