package com.dkd.manage;import com.xfkj.XiaoyudiApplication;import com.xfkj.manage.QuestionController;import org.junit.After;import org.junit.Before;import org.junit.Test;import org.junit.runner.RunWith;import org.slf4j.Logger;import org.slf4j.LoggerFactory;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;import org.springframework.boot.test.context.SpringBootTest;import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;import org.springframework.test.web.servlet.MockMvc;import org.springframework.test.web.servlet.setup.MockMvcBuilders;@RunWith(SpringJUnit4ClassRunner.class)@SpringBootTest(classes = XiaoyudiApplication.class, properties = "/application.properties")@AutoConfigureMockMvcpublic class QuestionControllerTest {    private final Logger logger = LoggerFactory.getLogger(QuestionControllerTest.class);    private MockMvc mockMvc;    @Autowired    private QuestionController questionController;    private String reqUrl = "/manage/roll";    @Before    public void setUp() throws Exception {        this.mockMvc = MockMvcBuilders.standaloneSetup(questionController).build();    }    @After    public void tearDown() throws Exception {    }    @Test    public void toPcdiList() throws Exception{    }    @Test    public void toPcdiInfo() throws Exception{    }    @Test    public void addPcdiMust() throws Exception{    }    @Test    public void getIntroduceList() throws Exception{    }    @Test    public void toPcdidelete() throws Exception{    }    @Test    public void toPcdiSelectList() throws Exception{    }    @Test    public void getpcdiSelectList() throws Exception{    }    @Test    public void pcdiSelectDelete() throws Exception{    }    @Test    public void toPcdiSelectAdd() throws Exception{    }    @Test    public void toAbcPage() throws Exception{    }    @Test    public void getAbcList() throws Exception{    }    @Test    public void toAbcDelete() throws Exception{    }    @Test    public void toAbcAdd() throws Exception{    }    @Test    public void toResultPage() throws Exception{    }    @Test    public void getresultList() throws Exception{    }    @Test    public void resultInfoPage() throws Exception{    }    @Test    public void toResultPage1() throws Exception{    }    @Test    public void adviceInfo() throws Exception{    }    @Test    public void adviceupdate() throws Exception{    }    @Test    public void toWordListPage() throws Exception{    }    @Test    public void toWordList() throws Exception{    }    @Test    public void toWordInfoPage() throws Exception{    }    @Test    public void wordDelete() throws Exception{    }    @Test    public void wordAdd() throws Exception{    }    @Test    public void deleteSession() throws Exception{    }    @Test    public void checkWebUserLogin() throws Exception{    }    @Test    public void getPageNum() throws Exception{    }    @Test    public void getPageSize() throws Exception{    }    @Test    public void getDraw() throws Exception{    }    @Test    public void setHttpServletResponse() throws Exception{    }    @Test    public void setHttpServletResponse1() throws Exception{    }}