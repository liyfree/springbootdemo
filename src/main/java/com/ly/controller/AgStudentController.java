package com.ly.controller;

/**
 * Created by Administrator on 2019/8/2110:48.
 */

import com.github.pagehelper.PageInfo;
import com.ly.model.AgStudent;
import com.ly.service.AgStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springbootdemo
 * @description:
 * @author: liyang
 * @create: 2019-08-21 10:48
 **/
@RestController
public class AgStudentController {
    @Autowired
    private AgStudentService agStudentService;

    /**
     * 查询分页集合
     * @return
     */
    @GetMapping("/list")
    public  PageInfo<AgStudent> getList() {
        PageInfo<AgStudent> pageInfo = agStudentService.findPageList();
        return pageInfo;
    }

    /**
     * 新增
     * @param agStudent
     */
    @PostMapping(value = "/add")
    public void addAgStudent(AgStudent agStudent) {
        agStudentService.doAdd(agStudent);
    }
}
