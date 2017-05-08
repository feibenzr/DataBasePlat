package com.unionpay.nx.dao;

import com.unionpay.nx.entity.Partner;

public interface PartnerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Partner record);

    int insertSelective(Partner record);

    Partner selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Partner record);

    int updateByPrimaryKey(Partner record);
}