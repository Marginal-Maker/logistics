package com.example.service.impl;

import com.example.dto.UserDto;
import com.example.mapper.UserMapper;
import com.example.mapper.UserRoleMapper;
import com.example.pojo.User;
import com.example.pojo.UserExample;
import com.example.pojo.UserRoleExample;
import com.example.pojo.UserRoleKey;
import com.example.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.shiro.crypto.hash.Md5Hash;
import java.util.List;
import java.util.UUID;

/**
 * @descriotion
 * @auther majing
 * @data 2023/05/12/19:01
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserRoleMapper userRoleMapper;

    //后续可能需要自己修改
    @Override
    public List<User> selectUsers(User user) throws Exception {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        if(user != null){
            if(user.getUserName()!=null&& !"".equals(user.getUserName())){
                criteria.andUserNameEqualTo(user.getUserName());
            }
        }
        criteria.andU2NotEqualTo("1");
        return userMapper.selectByExample(userExample);
    }
    @Override
    public PageInfo<User> selectUsersByPage(UserDto userDto) throws Exception {
        PageHelper.startPage(userDto.getPageNum(),userDto.getPageSize());
        List<User> list = this.selectUsers(userDto.getUser());
        return new PageInfo<>(list);
    }

    @Override
    public User selectByUserName(String userName) throws Exception {
        return userMapper.selectByUserName(userName);
    }

    @Override
    public UserRoleKey selectUserRoleId(Integer id) throws Exception {
        return userRoleMapper.selectByUserId(id);
    }

    @Override
    public User selectByPrimaryKey(Integer id) throws Exception {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer addUser(User user) throws Exception {
        return userMapper.insertSelective(user);
    }

    @Override
    public Integer updateUser(User user) throws Exception {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public Integer deleteUser(Integer id) throws Exception {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer saveAddUser(UserDto userDto) throws Exception {
        User user = userDto.getUser();
        if(user.getUserId()!=null){
            this.updateUser(user);
        }
        else {
            String salt = UUID.randomUUID().toString();
            Md5Hash passWordSalt = new Md5Hash(user.getPassword(),salt);
            user.setPassword(passWordSalt.toString());
            user.setU1(salt);
            this.addUser(user);
        }

        UserRoleExample example = new UserRoleExample();
        example.createCriteria().andUserIdEqualTo(user.getUserId());
        userRoleMapper.deleteByExample(example);

        Integer roleId = userDto.getRoleIds();
        if(roleId != null ){
            UserRoleKey userRoleKey = new UserRoleKey();
            userRoleKey.setUserId(user.getUserId());
            userRoleKey.setRoleId(roleId);
            userRoleMapper.insertSelective(userRoleKey);
        }
        return 1;
    }

}
