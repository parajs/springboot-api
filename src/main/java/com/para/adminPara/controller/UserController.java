package com.para.adminPara.controller;

import com.para.adminPara.bean.User;
import com.para.adminPara.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

  @Autowired
  private UserService userService;
  @GetMapping("/getById")
  public User getById(@RequestParam(value = "id") Integer id) {
    return userService.getById(id);
  }
}
