package com.para.adminPara.service;

import java.util.List;
import java.util.Map;

import com.para.adminPara.bean.User;
import com.para.adminPara.exception.BizException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.para.adminPara.dao.UserDao;

@Service
public class UserService {
  @Autowired()
  private UserDao userDao;

  public List<User> getByMap(Map<String,Object> map) throws BizException {
    return userDao.getByMap(map);
  }

  public User getById(Integer id) throws BizException{
    return userDao.getById(id);
  }

  public User create(User user) throws BizException{
    userDao.create(user);
    return user;
  }

  public User update(User user) throws BizException{
    userDao.update(user);
    return user;
  }

  public int delete(Integer id) throws BizException {
    return userDao.delete(id);
  }

}
