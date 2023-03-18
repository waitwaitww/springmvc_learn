package com.feng.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.feng.pojo.User;
import com.feng.util.jsonUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class UserController {

//    @ResponseBody//它就不会走视图解析器，会直接返回一个字符串
    @RequestMapping(value = "/j1",produces = "application/json;charset=utf-8")
    public String json1() throws JsonProcessingException {

        //jackson objectMapper对象
        ObjectMapper mapper = new ObjectMapper();

        User user = new User(111, "杨锋", 3);

        String s = mapper.writeValueAsString(user);
        return s;
    }

    @RequestMapping(value = "/j2",produces = "application/json;charset=utf-8")
    public String json2() throws JsonProcessingException {

        //jackson objectMapper对象
        ObjectMapper mapper = new ObjectMapper();

        List<User> user = new ArrayList<User>();

        User user1 = new User(111, "杨锋1", 3);
        User user2 = new User(111, "杨锋2", 3);
        User user3 = new User(111, "杨锋3", 3);
        User user4 = new User(111, "杨锋4", 3);

        user.add(user1);
        user.add(user2);
        user.add(user3);
        user.add(user4);


        String s = mapper.writeValueAsString(user);
        return s;
    }

    @RequestMapping(value = "/j3",produces = "application/json;charset=utf-8")
    public String json3() throws JsonProcessingException {

        Date date = new Date();

        return jsonUtil.getJson(date,"yyyy-MM-dd HH-mm-ss");
    }

    @RequestMapping(value = "/j4",produces = "application/json;charset=utf-8")
    public String json4() throws JsonProcessingException {

        List<User> user = new ArrayList<User>();

        User user1 = new User(111, "杨锋1", 3);
        User user2 = new User(111, "杨锋2", 3);
        User user3 = new User(111, "杨锋3", 3);
        User user4 = new User(111, "杨锋4", 3);

        user.add(user1);
        user.add(user2);
        user.add(user3);
        user.add(user4);
        String string = JSON.toJSONString(user);
        return string;
    }

}
