package com.javaweb.stuback.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 班级
 * </p>
 *
 * @author jobob
 * @since 2020-10-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Grades implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 专业名
     */
    private String mName;

    /**
     * 班级名称
     */
    private String gName;


}
