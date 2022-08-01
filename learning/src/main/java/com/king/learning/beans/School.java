package com.king.learning.beans;

import lombok.Data;

/**
 * @author king
 * @version 1.0
 * @className School
 * @description TODO
 * @date 2022/5/14
 */
@Data
public class School {

    /**
     * 学校名称
     */
    private String schoolName;

    /**
     * 学校地址
     */
    private String schoolAddress;

    /**
     * 学校类型
     */
    private String schoolType;

    /**
     * 学校级别
     */
    private String schoolLevel;

}
