package com.ly.service.impl;

/**
 * Created by Administrator on 2019/8/2110:26.
 */

import com.github.pagehelper.PageHelper;
import com.ly.dao.AgStudentMapper;
import com.ly.model.AgStudent;
import com.ly.service.AgStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: springbootdemo
 * @description:
 * @author: liyang
 * @create: 2019-08-21 10:26
 **/
@Service
public class AgStudentServiceImpl implements AgStudentService {
    @Autowired
    private AgStudentMapper agStudentMapper;

    @Override
    public List<AgStudent> findList() {
        PageHelper.startPage(1, 10);
        return agStudentMapper.selectAll();
    }
}
