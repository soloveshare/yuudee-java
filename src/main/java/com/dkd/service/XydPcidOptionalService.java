package com.dkd.service;

import com.dkd.common.query.GenericQueryParam;
import com.dkd.model.XydAnswerRecord;
import com.dkd.model.XydParents;
import com.dkd.model.XydPcidOptional;
import com.dkd.model.XydPcidType;

import java.util.List;

/**
 * Created by mai xiaogang on 2018/10/8.
 */
public interface XydPcidOptionalService {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(XydPcidOptional record);

    XydPcidOptional selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(XydPcidOptional record);

    List<XydPcidOptional> selectByTypeLis(XydPcidOptional xydPcidOptional);
    //获取每种类型题加对应的答案
    List<XydPcidOptional> selectByTypeAndOutLis(XydPcidType pcidType, XydAnswerRecord xydAnswerRecord, XydParents xydParents);

    int selectByParamCount(GenericQueryParam queryParam);

    List<XydPcidOptional> selectByParamList(GenericQueryParam queryParam);

    List<XydPcidOptional> selectList(XydPcidOptional addObject);
}
