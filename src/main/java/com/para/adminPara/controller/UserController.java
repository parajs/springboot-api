package com.para.adminPara.controller;

import com.para.adminPara.service.UserService;
import com.para.adminPara.util.ResultBody;
import org.springframework.beans.factory.annotation.Autowired;
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
  public ResultBody getById(@RequestParam(value = "id") Integer id)  {
    return ResultBody.success(userService.getById(id));

  }
}
