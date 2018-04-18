package com.dubbo.learn.domain.mapper;

import com.dubbo.learn.domain.model.BillnoSn;


public interface BillnoSnMapper {
    int deleteByPrimaryKey(String billnosnSeq);

    int insert(BillnoSn record);

    int insertSelective(BillnoSn record);

    BillnoSn selectByPrimaryKey(String billnosnSeq);

    int updateByPrimaryKeySelective(BillnoSn record);

    int updateByPrimaryKey(BillnoSn record);
}