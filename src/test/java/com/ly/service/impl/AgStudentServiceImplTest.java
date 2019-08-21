package com.ly.service.impl;

import com.github.pagehelper.PageInfo;
import com.ly.dao.AgStudentMapper;
import com.ly.model.AgStudent;
import com.ly.service.AgStudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2019/8/2116:25.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AgStudentServiceImplTest {
    @Autowired
    private AgStudentMapper agStudentMapper;
    @Autowired
    private AgStudentService agStudentService;
    @Test
    @Transactional
    public void doAdd() {
        //@Transactional 注解开启事务，可以防止数据提交到数据库
        AgStudent agStudent = new AgStudent();
        agStudent.setId("160d8b6279704j");
        agStudent.setStuName("小龙女5");
        agStudent.setStuSex(1);
        agStudent.setStatus(1);
        agStudent.setCreateDt(new Date());
        agStudentMapper.insertSelective(agStudent);
    }

    @Test
    public void findPageList() {
        PageInfo<AgStudent> pageList = agStudentService.findPageList();
    }
}
