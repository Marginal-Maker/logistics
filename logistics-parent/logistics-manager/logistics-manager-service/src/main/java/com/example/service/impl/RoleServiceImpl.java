package com.example.service.impl;

import com.example.mapper.RoleMapper;
import com.example.mapper.UserMapper;
import com.example.mapper.UserRoleMapper;
import com.example.pojo.*;
import com.example.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


/**
 * @descriotion RoleService实现类
 * @author MARGIN
 * @data 2023/05/15/12:46
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private UserRoleMapper userRoleMapper;
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<Role> selectRoles(Role role) throws Exception {
        RoleExample roleExample = new RoleExample();
        return roleMapper.selectByExample(roleExample);
    }

    @Override
    public Role selectRole(Integer id) throws Exception {
        return roleMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer addRole(Role role) throws Exception {
        return roleMapper.insertSelective(role);
    }

    @Override
    public Integer updateRole(Role role) throws Exception {
        return roleMapper.updateByPrimaryKey(role);
    }

    @Override
    public Integer deleteRole(Integer id) throws Exception {
        UserRoleExample userRoleExample = new UserRoleExample();
        userRoleExample.createCriteria().andRoleIdEqualTo(id);
        userRoleMapper.deleteByExample(userRoleExample);
        return roleMapper.deleteByPrimaryKey(id);
    }

}
