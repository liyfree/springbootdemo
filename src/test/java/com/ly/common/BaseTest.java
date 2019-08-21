package com.ly.common;

/**
 * Created by Administrator on 2019/8/2114:30.
 */

import org.junit.Before;
import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * @program: springbootdemo
 * @description: 测试类基类
 * @author: liyang
 * @create: 2019-08-21 14:30
 **/
public class BaseTest {
    @Autowired
    private WebApplicationContext webApplicationContext;
    protected MockMvc mockMvc;
    protected MockHttpServletRequest request;
    protected MockHttpServletResponse response;
    public Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 初始化SpringmvcController类测试环境
     */
    @Before
    public void setup(){
        //加载web容器上下文
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }
}
