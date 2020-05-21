package com.zengpc.dao;


import com.zengpc.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    List<User> getUsers();

    int delete(String rowId);

    int insertInfo(User user);
}
