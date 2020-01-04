package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.Test;
import com.example.demo.service.TestService;

/**
 * TEST情報 Controller
 */
@Controller
public class TestController {

    /**
     * TEST情報 Service
     */
    @Autowired
    TestService testService;

    /**
     * TEST情報一覧画面を表示
     * @param model Model
     * @return TEST情報一覧画面のHTML
     */
    @RequestMapping(value = "/test/list", method = RequestMethod.GET)
    public String displayList(Model model) {
        List<Test> testlist = testService.searchAll();
        model.addAttribute("testlist", testlist);
        return "test/list";
    }
}