package com.ly.controller;

/**
 * Created by Administrator on 2019/8/2110:48.
 */

import com.ly.model.AgStudent;
import com.ly.service.AgStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @GetMapping("/list")
    public List<AgStudent>  getList(){
        List<AgStudent> studentList = agStudentService.findList();
        return studentList;
    }
}
