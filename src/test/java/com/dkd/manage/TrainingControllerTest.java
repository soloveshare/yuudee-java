package com.dkd.manage;import com.dkd.XiaoyudiApplication;import org.junit.After;import org.junit.Before;import org.junit.Test;import org.junit.runner.RunWith;import org.slf4j.Logger;import org.slf4j.LoggerFactory;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;import org.springframework.boot.test.context.SpringBootTest;import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;import org.springframework.test.web.servlet.MockMvc;import org.springframework.test.web.servlet.MvcResult;import org.springframework.test.web.servlet.ResultActions;import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;import org.springframework.test.web.servlet.setup.MockMvcBuilders;@RunWith(SpringJUnit4ClassRunner.class)@SpringBootTest(classes = XiaoyudiApplication.class, properties = "/application.properties")@AutoConfigureMockMvcpublic class TrainingControllerTest {    private final Logger logger = LoggerFactory.getLogger(TrainingControllerTest.class);    private MockMvc mockMvc;    @Autowired    private TrainingController trainingController;    private String reqUrl = "/manage/trainTest";    @Before    public void setUp() throws Exception {        this.mockMvc = MockMvcBuilders.standaloneSetup(trainingController).build();    }    @After    public void tearDown() throws Exception {    }    @Test    public void toCoursewaretListPage() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void touserDetailList() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void toGetTrainingResultList() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void getTrainingResultList() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void getCoursewaretList1() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void getCoursewaretList() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void getUserDetailList() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void formatDouble3() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void deleteSession() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void checkWebUserLogin() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void getPageNum() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void getPageSize() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void getDraw() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void setHttpServletResponse() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void setHttpServletResponse1() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }}