package com.three.service;

import com.three.bean.Job;
import com.three.bean.department;
import com.three.bean.employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Mapper
@Service
public interface employeeServiceInterface {

    List<department> selectDept();

    List<Job> selectJob();

    int getUserIdByUserName(String name);

    int getTotal();

    employee selectById(Integer id);

    void deleteById(Integer id);

    List<employee> selectByManyMessage(String employeeName,String employeeCardId,Integer job_id,Integer sex,String phone,Integer dept_id,Integer start,Integer row);

    int getTotalByManyMessage(String employeeName,String employeeCardId,Integer job_id,Integer sex,String phone,Integer dept_id);

    List<employee> selectusersPage(Integer start, Integer row);

    void addEmployee(Integer user_id, Integer depart_id, Integer job_id, String name, String crad_id, String address, String post_code,
                     String tel, String phone, String qq, String email, Integer sex, String party, String bir, String race, String edu, String spe, String hobby, String remark);
}
