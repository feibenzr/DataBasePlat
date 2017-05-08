package com.unionpay.nx.dao;

import java.util.List;

import com.unionpay.nx.entity.Erweima;
import com.unionpay.nx.entity.User;

public interface ErweimaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Erweima record);

    int insertSelective(Erweima record);

    Erweima selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Erweima record);

    int updateByPrimaryKey(Erweima record);
    
    List<Erweima> getAllErweima();
}