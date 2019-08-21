package com.ly.service;

import com.github.pagehelper.PageInfo;
import com.ly.model.AgStudent;

import java.util.List;

/**
 * Created by Administrator on 2019/8/2110:26.
 */
public interface AgStudentService {

    /**
     * 查询分页集合
     * @return
     */
    PageInfo<AgStudent> findPageList();

    /**
     * 新增用户
     */
    void doAdd(AgStudent agStudent);
}
