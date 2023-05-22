package com.example.controller;

import com.example.dto.UserDto;
import com.example.pojo.Role;
import com.example.pojo.User;
import com.example.pojo.UserRoleKey;
import com.example.service.RoleService;
import com.example.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @descriotion
 * @author majing
 * @data 2023/05/12/21:02
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;
    @GetMapping("/deleteUser")
    public String deleteUser(Integer userId)throws Exception{
        userService.deleteUser(userId);
        return "redirect:/user/users";
    }
    @GetMapping ("/users")
    public String selectUsers(UserDto userDto, Model model) throws Exception{
        PageInfo<User> pageInfo = userService.selectUsersByPage(userDto);
        System.out.println(pageInfo.getTotal());
        model.addAttribute("pageInfo", pageInfo);
        return "user/user";
    }
    @GetMapping("/addUser")
    public String addUser(Integer userId, Model model) throws Exception{
        if(userId != null && userId>0){
            User user = userService.selectByPrimaryKey(userId);
            UserRoleKey userRoleKey = userService.selectUserRoleId(userId);
            UserDto userDto = new UserDto();
            userDto.setUser(user);
            userDto.setRoleIds(userRoleKey.getRoleId());
            model.addAttribute("userDto",userDto);
        }
        List<Role> roles = roleService.selectRoles(new Role());
        model.addAttribute("role",roles);
        return "user/addUser";
    }
    @PostMapping("/saveAdd")
    public String saveAdd(UserDto userDto)throws Exception{
        Integer flag = userService.saveAddUser(userDto);
        return "redirect:/user/users";
    }
    @GetMapping("/checkUserName")
    @ResponseBody
    public String check(String userName)throws Exception{
        User user = userService.selectByUserName(userName);
        if(user == null){
            return "1";
        }
        return "0";
    }
}
