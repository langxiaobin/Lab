package com.lxb.example.service;

import com.lxb.example.model.ContractInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TestService {
    List<ContractInfo>  getAll();
}
