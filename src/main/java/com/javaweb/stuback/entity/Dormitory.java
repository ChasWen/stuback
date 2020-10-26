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
public class Dormitory implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 宿舍楼
     */
    private String dName;

    /**
     * 宿舍号
     */
    private String dRoom;

    /**
     * 学生学号
     */
    private String sId;


}
