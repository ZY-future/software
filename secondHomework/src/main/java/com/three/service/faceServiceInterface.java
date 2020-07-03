package com.three.service;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface faceServiceInterface {

    int faceVerify(String base64);

    boolean faceRegister(String base64, Integer userId);
}
