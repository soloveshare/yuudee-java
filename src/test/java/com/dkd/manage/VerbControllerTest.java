package com.dkd.manage;import com.xfkj.XiaoyudiApplication;import com.xfkj.manage.VerbController;import org.junit.After;import org.junit.Before;import org.junit.Test;import org.junit.runner.RunWith;import org.slf4j.Logger;import org.slf4j.LoggerFactory;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;import org.springframework.boot.test.context.SpringBootTest;import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;import org.springframework.test.web.servlet.MockMvc;import org.springframework.test.web.servlet.MvcResult;import org.springframework.test.web.servlet.ResultActions;import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;import org.springframework.test.web.servlet.setup.MockMvcBuilders;@RunWith(SpringJUnit4ClassRunner.class)@SpringBootTest(classes = XiaoyudiApplication.class, properties = "/application.properties")@AutoConfigureMockMvcpublic class VerbControllerTest {    private final Logger logger = LoggerFactory.getLogger(VerbControllerTest.class);    private MockMvc mockMvc;    @Autowired    private VerbController verbController;    private String reqUrl = "/manage/verb";    @Before    public void setUp() throws Exception {        this.mockMvc = MockMvcBuilders.standaloneSetup(verbController).build();    }    @After    public void tearDown() throws Exception {    }    @Test    public void toVerbTrainingPage() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void toVerbTestPage() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void toAddVerbTraining() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void toAddVerbTest() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void jiaoyan() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void getVerbTestList() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void addVerbTest() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void main() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void deleteVerbTest() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void updateVerbTest() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void verbTestDetail() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void getVerbTrainingList() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void getHelpTime() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void addVerbTraining() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void deleteVerbTraining() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void updateVerbTraining() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void verbTrainingDetail() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void deleteSession() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void checkWebUserLogin() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void getPageNum() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void getPageSize() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void getDraw() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void setHttpServletResponse() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }    @Test    public void setHttpServletResponse1() throws Exception {        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post(reqUrl + "/generalLogin").param("phone", "17795591253").param("password", "123456").param("qcellcoreId", "1"));        MvcResult mvcResult = resultActions.andReturn();        logger.info("=====generalLogin mvcResult:" + mvcResult.getResponse().getStatus());        String result = mvcResult.getResponse().getContentAsString();        logger.info("=====generalLogin result:" + result);    }}