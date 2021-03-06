package com.dkd.service;

import com.dkd.common.query.GenericQueryParam;
import com.dkd.model.XydNounTest;

import java.util.List;

/**
 * Created by King on 2018/9/29.
 */
public interface XydNounTestService {

    List<XydNounTest> selectAllRand();

    int count(GenericQueryParam queryParam);

    List<XydNounTest> select(GenericQueryParam queryParam);

    int insert(XydNounTest nounTest);

    int delete(Integer id);

    int update(XydNounTest nounTest);

    XydNounTest selectById(Integer id);
}
