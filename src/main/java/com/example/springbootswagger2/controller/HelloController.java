package com.example.springbootswagger2.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chenchanglin 2021-01-21 13:58
 */
@Api(tags = "用户管理")
@RestController
@RequestMapping("/user")
public class HelloController {

    private Map<String, Object> userInfo() {
        Map<String, Object> map = new HashMap<>(16);
        map.put("id", 1);
        map.put("name", "陈畅林chencl");
        map.put("age", 18);
        return map;
    }

    @ApiOperation("查询用户信息")
    @GetMapping
    public Map<String, Object> getUserInfo() {
        return userInfo();
    }

    @ApiOperation("添加用户信息")
    @PostMapping
    public void addUserInfo() {
    }

    @ApiOperation("更新用户信息")
    @PutMapping
    public void editUserInfo() {
    }

    @ApiOperation("删除用户信息")
    @DeleteMapping
    public void removeUserInfo() {
    }

}
