package com.ly.controller;

import com.ly.common.BaseTest;
import javafx.scene.media.MediaPlayer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.Date;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

/**
 * Created by Administrator on 2019/8/2114:10.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class AgStudentControllerTest extends BaseTest {

    @Test
    public void getList() throws Exception {
        try {
            ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders.get("/list"));
            MvcResult mvcResult = resultActions.andDo(MockMvcResultHandlers.print()).andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
            MockHttpServletResponse response = mvcResult.getResponse();
            response.setCharacterEncoding("UTF-8");
            String result = response.getContentAsString();
            System.out.println("==========结果为：==========\n" + result + "\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void addAgStudent() throws Exception {
        try {
            MultiValueMap params = new LinkedMultiValueMap();
            params.add("id", "160d8b627970we");
            params.add("stuName", "乔峰");
            params.add("stuSex ", "1");
            params.add("status ", "1");
            params.add("createDt", new Date().toString());
            mockMvc.perform(MockMvcRequestBuilders.post("/add").params(params))
                            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
