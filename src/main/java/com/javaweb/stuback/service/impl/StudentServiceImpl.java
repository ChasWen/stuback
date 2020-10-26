package com.javaweb.stuback.service.impl;

import com.javaweb.stuback.entity.Student;
import com.javaweb.stuback.mapper.StudentMapper;
import com.javaweb.stuback.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-10-26
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

}
