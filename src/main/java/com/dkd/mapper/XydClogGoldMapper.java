package com.dkd.mapper;

import com.dkd.model.XydClogGold;

public interface XydClogGoldMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(XydClogGold record);

    int insertSelective(XydClogGold record);

    XydClogGold selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(XydClogGold record);

    int updateByPrimaryKey(XydClogGold record);
}