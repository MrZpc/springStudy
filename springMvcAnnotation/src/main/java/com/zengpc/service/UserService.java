package com.zengpc.service;

import com.zengpc.dao.UserDao;
import com.zengpc.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public List<User> getUserList(){
        return userDao.getUsers();
    }
}
