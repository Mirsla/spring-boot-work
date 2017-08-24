package com.web.mirsla;

import com.web.mirsla.controller.HelloWorldController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by Mirsla on 2017/8/24.
 */

//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = MockServletContext.class)
//@WebAppConfiguration

/**
 * 关于在不同的springboot版本种的测试方式是不同的。
 * 以前的方式可能是：
 *
 * @RunWith(SpringJUnit4ClassRunner.class)
 * @WebAppConfiguration
 * @SpringApplicationConfiguration(classes = MockServletContext.class)
 * 三个注解才能使用，到我使用的1.5以上的版本关于测试类可以直接使用
 * @RunWith(SpringRunner.class)
 * @SpringBootTest 这两个注解就够用了。
 * SpringRunner继承SpringJUnit4ClassRunner
 */

@RunWith(SpringRunner.class)
@SpringBootTest
class Chapter1ApplicationTests {

    private MockMvc mvc;

    @Before
    public void setUp() {
        mvc = MockMvcBuilders.standaloneSetup(new HelloWorldController()).build();
    }

    @Test
    public void getHello() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON)).
                andExpect(status().isOk()).andExpect((ResultMatcher) content().string(equalTo("Hello World")));
//        System.out.println();
    }

}
