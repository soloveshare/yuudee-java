package com.dkd.api;import com.dkd.XiaoyudiApplication;import org.junit.After;import org.junit.Before;import org.junit.Test;import org.junit.runner.RunWith;import org.slf4j.Logger;import org.slf4j.LoggerFactory;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;import org.springframework.boot.test.context.SpringBootTest;import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;import org.springframework.test.web.servlet.MockMvc;import org.springframework.test.web.servlet.setup.MockMvcBuilders;@RunWith(SpringJUnit4ClassRunner.class)@SpringBootTest(classes = XiaoyudiApplication.class, properties = "/application.properties")@AutoConfigureMockMvcpublic class ParentsCenterControllerTest {    private final Logger logger = LoggerFactory.getLogger(ParentsCenterControllerTest.class);    private MockMvc mockMvc;    @Autowired    private ParentsCenterController parentsCenterController;    private String reqUrl = "/app/parents";    @Before    public void setUp() throws Exception {        this.mockMvc = MockMvcBuilders.standaloneSetup(parentsCenterController).build();    }    @After    public void tearDown() throws Exception {    }    @Test    public void mxgTest() throws Exception{    }    @Test    public void parentsToAssess() throws Exception{    }    @Test    public void trainingRecords() throws Exception{    }    @Test    public void addRecord() throws Exception{    }}