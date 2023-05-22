package com.example.service;

import com.example.pojo.Role;

import java.util.List;
/**
 * @descriotion 角色的业务层
 * @author MARGIN
 * @date 2023/05/15/12:41
 */
public interface RoleService {
    /**
     * 查询符合条件的所有Role
     * @param role
     * @return List<Role>
     * @throws Exception
     */
    List<Role> selectRoles(Role role) throws Exception;

    /**
     * 根据。。。
     * @param id
     * @return Role
     * @throws Exception
     */
    Role selectRole(Integer id) throws Exception;

    /**
     * 添加角色信息
     * @param role
     * @return Role
     * @throws Exception
     */
    Integer addRole(Role role) throws Exception;

    /**
     * 更新用户信息
     * @param role
     * @return Integer
     * @throws Exception
     */
    Integer updateRole(Role role) throws Exception;

    /**
     * 根据编号删除用户信息
     * @param id
     * @return Integer
     * @throws Exception
     */
    Integer deleteRole(Integer id) throws Exception;
}
