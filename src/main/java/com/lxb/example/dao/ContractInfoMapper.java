package com.lxb.example.dao;

import com.lxb.example.model.ContractInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ContractInfoMapper {
    int deleteByPrimaryKey(Long serviceid);

    int insert(ContractInfo record);

    int insertSelective(ContractInfo record);

    ContractInfo selectByPrimaryKey(Long serviceid);

    int updateByPrimaryKeySelective(ContractInfo record);

    int updateByPrimaryKey(ContractInfo record);

    List<ContractInfo> getAll();
}