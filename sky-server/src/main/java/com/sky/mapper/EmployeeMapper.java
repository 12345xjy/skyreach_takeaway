package com.sky.mapper;

import com.sky.entity.Employee;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface EmployeeMapper {

    /**
     * 根据用户名查询员工
     * @param username
     * @return
     */
    @Select("select * from employee where username = #{username}")
    Employee getByUsername(String username);

    /**
     * 插入员工数据
     * @param username
     * @return
     */    
    @Insert("insert into employee (name, username, phone, sex, id_number, password, status, create_time, update_time, create_user, update_user) values (#{name}, #{username}, #{phone}, #{sex}, #{idNumber}, #{password}, #{status}, #{createTime}, #{updateTime}, #{createUser}, #{updateUser})")
    void insert(Employee employee);
    
}
