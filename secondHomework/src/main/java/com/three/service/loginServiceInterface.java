package com.three.service;

import com.three.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;
@Mapper
@Service
public interface loginServiceInterface {

    User findByName(String name);

    void updatePasswordById(Integer id,  String newPassword);

    User findById(int userId);
}
