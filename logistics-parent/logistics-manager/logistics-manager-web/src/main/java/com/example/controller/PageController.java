package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @descriotion 由于jsp文件存储在WEB-INF下，浏览器无法直接访问，因此需要页面跳转控制器
 * @auther majing
 * @data 2023/05/12/13:01
 */
@Controller
public class PageController {
    @RequestMapping("/{path}")
    public String shoePage(@PathVariable String path){
        return path;
    }
}
