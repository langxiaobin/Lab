package com.lxb.example.service.impl;

import com.lxb.example.dao.ContractInfoMapper;
import com.lxb.example.model.ContractInfo;
import com.lxb.example.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xiaobin.lang
 * @create 2019-03-18 16:07
 * @desc 测试service实现
 **/
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private ContractInfoMapper contractInfoMapper;

    @Override
    public List<ContractInfo>  getAll(){
        List<ContractInfo> list = contractInfoMapper.getAll();
        return list;
    }
}
