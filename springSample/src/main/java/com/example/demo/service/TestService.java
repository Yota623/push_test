package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Test;
import com.example.demo.repository.TestRepository;

/**
 * TEST情報 Service
 */
@Service
@Transactional(rollbackOn = Exception.class)
public class TestService {

    /**
     * TEST情報 Repository
     */
    @Autowired
    TestRepository testRepository;

    public List<Test> searchAll() {
        // testTBLの内容を全検索
        return testRepository.findAll();
    }
}