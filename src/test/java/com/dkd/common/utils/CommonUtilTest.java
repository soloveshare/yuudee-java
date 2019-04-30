package com.dkd.common.utils;import com.dkd.XiaoyudiApplication;import com.dkd.common.config.Global;import com.dkd.common.constant.ResultStant;import com.dkd.model.XydPhoneQcellcore;import com.dkd.service.XydPhoneQcellcoreService;import org.apache.http.entity.ContentType;import org.junit.Test;import org.junit.runner.RunWith;import org.slf4j.Logger;import org.slf4j.LoggerFactory;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;import org.springframework.boot.test.context.SpringBootTest;import org.springframework.data.redis.core.RedisTemplate;import org.springframework.mock.web.MockHttpServletRequest;import org.springframework.mock.web.MockMultipartFile;import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;import org.springframework.transaction.annotation.Transactional;import org.springframework.web.multipart.MultipartFile;import javax.servlet.http.HttpServletRequest;import java.io.File;import java.util.Date;import java.util.HashMap;import java.util.Locale;import java.util.Map;import static com.dkd.manage.VerbControllerTest.image2byte;@RunWith(SpringJUnit4ClassRunner.class)@SpringBootTest(classes = XiaoyudiApplication.class,properties = "/application.properties")@AutoConfigureMockMvc@Transactionalpublic class CommonUtilTest {    private Logger logger =  LoggerFactory.getLogger(CommonUtilTest.class);    @Autowired    private RedisTemplate redisTemplate;    @Autowired    private RedisService redisService;    @Autowired    Global global;    @Autowired    private XydPhoneQcellcoreService xydPhoneQcellcoreService;    @Test    public void AliyunSendUtilTest(){        String phone="15956993592";        String sedType="86";        AliyunSendUtil.sendCode("", redisTemplate, "86", "Hello Test");        AliyunSendUtil.sendCode("", redisTemplate, "86", global.getLoginMSM());       // redisService.set(sedType+phone,"亲爱的${name},您的验证码为${code}",24*60*60L);        redisService.remove(sedType+phone);        AliyunSendUtil.sendCode(phone, redisTemplate, sedType, global.getLoginMSM());        AliyunSendUtil.sendCode(phone, redisTemplate, sedType, global.getRegisterMSM());        XydPhoneQcellcore xydPhoneQcellcore = xydPhoneQcellcoreService.selectByPrimaryKey(2);        AliyunSendUtil.sendCountryCode("", redisTemplate,xydPhoneQcellcore, "Hello Test");        AliyunSendUtil.sendCountryCode("", redisTemplate,xydPhoneQcellcore,  global.getLoginMSM());        // redisService.set(sedType+phone,"亲爱的${name},您的验证码为${code}",24*60*60L);        redisService.remove(sedType+phone);        AliyunSendUtil.sendCountryCode(phone, redisTemplate,xydPhoneQcellcore, global.getLoginMSM());        AliyunSendUtil.sendCountryCode(phone, redisTemplate,xydPhoneQcellcore, global.getRegisterMSM());        AliyunSendUtil.sendText("","","");        AliyunSendUtil.sendText(phone,"","");        AliyunSendUtil.sendText(phone,"86","");        AliyunSendUtil.sendText(phone,"86",global.getLoginMSM());        AliyunSendUtil.sendText(phone,"86","Hello Test");        AliyunSendUtil.sendText(phone,"87","");        AliyunSendUtil.sendText(phone,"87",global.getLoginMSM());        AliyunSendUtil.sendText(phone,"87","Hello Test");        AliyunSendUtil.sendCountryText("",null,"");        AliyunSendUtil.sendCountryText(phone,xydPhoneQcellcore,"");        AliyunSendUtil.sendCountryText(phone,xydPhoneQcellcore,"");        AliyunSendUtil.sendCountryText(phone,xydPhoneQcellcore,global.getLoginMSM());        AliyunSendUtil.sendCountryText(phone,xydPhoneQcellcore,"");        AliyunSendUtil.sendCountryText(phone,xydPhoneQcellcore,"Hello Test");        AliyunSendUtil.sendRemind("","","","");        AliyunSendUtil.sendRemind(phone,"","test","");        AliyunSendUtil.sendRemind(phone,"86","test","");        AliyunSendUtil.sendRemind(phone,"86","test",global.getLoginMSM());        AliyunSendUtil.sendRemind(phone,"86","test","hello");        AliyunSendUtil.sendRemind(phone,"87","test","");        AliyunSendUtil.sendRemind(phone,"87","test",global.getLoginMSM());        AliyunSendUtil.sendRemind(phone,"87","test","hello");        AliyunSendUtil.sendCountryRemind("",xydPhoneQcellcore,"test","");        AliyunSendUtil.sendCountryRemind(phone,xydPhoneQcellcore,"test","");        AliyunSendUtil.sendCountryRemind(phone,xydPhoneQcellcore,"test","");        AliyunSendUtil.sendCountryRemind(phone,xydPhoneQcellcore,"test",global.getLoginMSM());        AliyunSendUtil.sendCountryRemind(phone,xydPhoneQcellcore,"test","");        AliyunSendUtil.sendCountryRemind(phone,xydPhoneQcellcore,"test","hello");    }    @Test    public void FileUtilsTest(){        MockMultipartFile mockMultipartFile = new MockMultipartFile("verbImage","verbImage.jpg", ContentType.IMAGE_JPEG.getMimeType(),image2byte("https://img.daokoudai.com/banner/ac/f7/acf776fefac94cef8221f47d5123388d.jpg"));        FileUtils.uploadfile(mockMultipartFile);    }    @Test    public void HttpUtilTest(){        HttpUtil httpUtil = new HttpUtil();        httpUtil.httpByPost("https://travis-ci.com","12");        httpUtil.sendGet("https://travis-ci.com","12");    }    @Test    public void IPUtilTest(){        IPUtil ipUtil = new IPUtil();        MockHttpServletRequest request = new MockHttpServletRequest();        IPUtil.getIpAddr(request);    }    @Test    public void ChineseCharToEnUtilTest(){        ChineseCharToEnUtil chineseCharToEnUtil = new ChineseCharToEnUtil();        ChineseCharToEnUtil.getAllFirstLetter("北京()9Oo*IO欢迎您");        ChineseCharToEnUtil.getAllFirstLetter(null);        ChineseCharToEnUtil.getAllFirstLetter("");        ChineseCharToEnUtil.getFirstLetter("");        ChineseCharToEnUtil.getFirstLetter(null);        ChineseCharToEnUtil.getFirstLetter("123");    }    @Test    public void StringUtilTest(){        StringUtil stringUtil = new StringUtil();        logger.info(StringUtil.CHINESE_BLANK);        logger.info(StringUtil.Simplified);        logger.info(StringUtil.Traditional);        StringUtil.double2Byte(Double.valueOf(2.8).doubleValue());        StringUtil.byte2double((byte)2);        StringUtil.byte2double((byte)0);        StringUtil.str2Int("1",2);        StringUtil.str2Int(null);        StringUtil.str2Int("1");        StringUtil.str2Int("s");        StringUtil.str2Int0("1");        StringUtil.toHexString("123456");        StringUtil.char2HexNumber("123456".charAt(0));        StringUtil.str2Double("123456.00");        StringUtil.get4she5ru(Double.valueOf("123456.00"),1);        StringUtil.str2Double("s");        StringUtil.str2Double(null);        StringUtil.htmlEscape("123456.00");        StringUtil.javaScriptEscape("00");        StringUtil.escapeHtml("<");        StringUtil.escapeHtml("s");        StringUtil.escapeHtml("");        StringUtil.escapeHtml(null);        StringUtil.escapeHtml(">");        StringUtil.escapeHtml("&");        StringUtil.replaceNBSP(null);        StringUtil.replaceNBSP("");        StringUtil.escapeHtml("\"");        StringUtil.removeHtml("123124\"");        StringUtil.removeHtml(null);        StringUtil.removeResouce("123124>\"");        StringUtil.removeResouce(null);        StringUtil.removeNRT("123124>\n\"");        StringUtil.test();        StringUtil.sqlQuote("123");        StringUtil.sqlQuote(null);        StringUtil.sqlQuote("\\");        StringUtil.sqlQuote("''");        StringUtil.sqlQuote("'");        StringUtil.sqlQuote("\"");        StringUtil.sqlQuote("\\");        StringUtil.strNotNull("123");        StringUtil.strNotNull("");        StringUtil.strIsNull("");        StringUtil.showSelect(null,null);        StringUtil.showSelect("select","select");        StringUtil.showSelect("select","select1");        StringUtil.strIsNull("1");        StringUtil.str2Long(null);        StringUtil.getParameter(null,null,null);        StringUtil.str2Long("2");        StringUtil.str2Long(" ");        StringUtil.str2Long("　");        StringUtil.int2Byte(1);        StringUtil.str2Byte0("1");        StringUtil.str2Byte0("s");        StringUtil.tranChs(new StringBuffer("123124我u"),true);        StringUtil.tranChs(new StringBuffer("123124我u"),false);        StringUtil.getClassName(this.getClass());        MockHttpServletRequest request = new MockHttpServletRequest();        StringUtil.strNotNull(request,null);        StringUtil.strNotNull(request,"1");        StringUtil.getParameter(request,"1213",null);    }    @Test    public void  VerifyCodeUtilsTest() {        try {            VerifyCodeUtils verifyCodeUtils = new VerifyCodeUtils();            VerifyCodeUtils.generateVerifyCode(0, null);            VerifyCodeUtils.outputImage(0, 0, new File("\test.img"), "");        }catch (Exception e){        }    }    @Test    public void  MyMD5UtilTest() {        try {            MyMD5Util verifyCodeUtils = new MyMD5Util();        }catch (Exception e){        }    }    @Test    public void  DateUtilTest() {        try {            DateUtil dateUtil = new DateUtil();            DateUtil.getDate();            DateUtil.formatDate(new Date());            DateUtil.getDate4Day(new Date());            DateUtil.format2English(new Date());            DateUtil.getDateyyyyMMdd();            DateUtil.getDateyyyyMMdd(new Date());            DateUtil.getDateyyyyMM(new Date());            DateUtil.getDateyyyy_MM_dd(new Date());            DateUtil.getLastMonthYYYYMM(new Date());            DateUtil.getYYYYMM(new Date());            DateUtil.getYYYYMMDD(new Date());            DateUtil.get30DayZeroClock(new Date());            DateUtil.getNextZeroDate(new Date());            DateUtil.getMonthLastDay(new Date());            DateUtil.getFirstDayByPreMonth(new Date());            DateUtil.getCalendar(new Date());            DateUtil.getChargeMonth(new Date());            DateUtil.getFirstDayByNextMonth(2019,1);            DateUtil.getDealDayByMonth(2019,1);            DateUtil.getFirstDayByPreMonth(2019,1);            DateUtil.getLastDayByMonth(2019,1);            DateUtil.getFirstDayByMonth(2019,1);            DateUtil.getDate("","");            DateUtil.getFirstDayByMonth("2019-01");            DateUtil.getNextDayByDate(new Date());            DateUtil.getZeroDate(new Date());            DateUtil.getLastTimeByMonth(new Date());            DateUtil.getDayEndByDate(new Date());            DateUtil.getNextMonthDayByDate(new Date());            DateUtil.getBeforeMothDateByDate(new Date());            DateUtil.getPreDayByDate(new Date());            DateUtil.begin(new Date());            DateUtil.end(new Date());            DateUtil.getPreDayByDate(new Date(),1);            DateUtil.getInt(new Date(),1);            DateUtil.getBeforeDay(new Date(),1);            DateUtil.isTheSameMonth(new Date(),1,2);            DateUtil.getAfterDay(null,1);            DateUtil.getPreDay000ByDate(new Date());            DateUtil.get7DayZeroClock(new Date());            DateUtil.getWeekFirstDay(new Date());            DateUtil.getWeekLastDay(new Date());            DateUtil.getFirstDayByDate(new Date());            DateUtil.getIntervalMonths(new Date());            DateUtil.getThreeMothDateByDate(new Date());            DateUtil.getIntevelDays(new Date(),new Date());            DateUtil.isTheSameMonth(new Date(),new Date());            DateUtil.dateEqualYM(new Date(),new Date());            DateUtil.isLastMonth(new Date(),new Date());            DateUtil.isTheSameDay(new Date(),new Date());            DateUtil.isTheSameDay(null,null);            DateUtil.getAfterMonth(new Date(),1);            DateUtil.getIntervalMonths(new Date(),new Date());            DateUtil.getMonthsCount(new Date(),new Date());            DateUtil.getDateY_M_D();            DateUtil.getNow();            DateUtil.getNext12Hours();            DateUtil.getDateHMS();            DateUtil.getCurrentTime();            DateUtil.getDateyyyyMM(new Date());            DateUtil.getPriorDayByDate(null);            DateUtil.parse(null,null);            DateUtil.parse(null);            DateUtil.parse("2018-123-12","yyyy-MM-dd");            DateUtil.format("yyyy-MM-dd", Locale.ENGLISH,new Date());            DateUtil.getMonthFirst("2019-04-29","yyyy-MM-dd");            DateUtil.getMonthFirst("2019-0429","yyyy-MM-dd");            DateUtil.getMonthEnd("2019-04-29","yyyy-MM-dd");            DateUtil.getMonthEnd("2019-0429","yyyy-MM-dd");            DateUtil.getMonthFirstDay("2019-04-29","yyyy-MM-dd");            DateUtil.getMonthFirstDay("2019-0429","yyyy-MM-dd");            DateUtil.getMonthEndDay("2019-04-29","yyyy-MM-dd");            DateUtil.getMonthEndDay("2019-0429","yyyy-MM-dd");            DateUtil.getFirstDayByMonth("2019-04-29","yyyy-MM-dd");            DateUtil.parse(null,null);            DateUtil.parse(null,null);            DateUtil.dateEqualYM(null,null);            DateUtil.isLastMonth(null,null);            DateUtil.getAfterMonth(null,1);            DateUtil.getStrDate(new Date(),"yyyy-MM-dd");            DateUtil.parse(null);            DateUtil.getCalendar(null);            DateUtil.getDayEndByDate(null);            DateUtil.getNextDayByDate(null);            DateUtil.begin(null);            DateUtil.end(null);            DateUtil.getCurrentMonthDay(new Date());            DateUtil.getThreeMonthMornTimeLong(new Date());            DateUtil.findDates(new Date(),new Date());            DateUtil.getThreeMonthTimeLong(new Date());            DateUtil.getMonth(new Date());            DateUtil.getPriorDayByDate(new Date());            DateUtil.getLastWeekDate(new Date());            DateUtil.getMonthAge(new Date(),new Date());            DateUtil.getFirstDayByNextMonth(new Date());            DateUtil.getAfterDay(new Date(),1);            DateUtil.getLastMonthByDate(new Date());            DateUtil.parse("2019-12-12 12:12:12");            DateUtil.getDate("2019-12-12 12:12:12");            DateUtil.parseDate("2019-12-12");            DateUtil.getDateyyyy_MM_dd();        }catch (Exception e){            e.printStackTrace();        }    }}