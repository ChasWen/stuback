package com.javaweb.stuback.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2020-10-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 学院
     */
    private String cName;

    /**
     * 专业
     */
    private String mName;

    /**
     * 班级
     */
    private String gName;

    /**
     * 学生姓名
     */
    private String sName;

    /**
     * 性别
     */
    private String sSex;

    /**
     * 学号
     */
    private String sId;

    /**
     * 电话
     */
    private String sPhone;

    /**
     * 宿舍楼
     */
    private String dName;

    /**
     * 宿舍号
     */
    private String dRoom;


}
