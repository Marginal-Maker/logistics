package com.example.service;

import com.example.dto.UserDto;
import com.example.pojo.User;
import com.example.pojo.UserRoleKey;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @descriotion 用户业务层逻辑
 * @author MARGIN
 * @data 2023/05/12/18:53
 */
public interface UserService {
    /**
     * 查询所有符合条件的User
     * @param user
     * @return
     * @throws Exception
     */
    List<User> selectUsers(User user) throws Exception;

    /**
     * 根据UserName查询user
     * @param userName
     * @return
     * @throws Exception
     */
    User selectByUserName(String userName) throws Exception;

    /**
     * 根据id查询user对应的role
     * @param id
     * @return
     * @throws Exception
     */
    UserRoleKey selectUserRoleId(Integer id) throws Exception;

    /**
     * 根据id查询user
     * @param id
     * @return
     * @throws Exception
     */
    User selectByPrimaryKey(Integer id) throws Exception;

    /**
     * 添加user
     * @param user
     * @return
     * @throws Exception
     */
    Integer addUser(User user) throws Exception;

    /**
     * 更新user
     * @param user
     * @return
     * @throws Exception
     */
    Integer updateUser(User user) throws Exception;

    /**
     * 删除user
     * @param id
     * @return
     * @throws Exception
     */
    Integer deleteUser(Integer id) throws Exception;

    /**
     * 保存更改
     * @param userDto
     * @return
     * @throws Exception
     */
    Integer saveAddUser(UserDto userDto)throws Exception;

    /**
     * 分页查询
     * @param userDto
     * @return
     * @throws Exception
     */
    PageInfo<User> selectUsersByPage(UserDto userDto)throws Exception;





}
