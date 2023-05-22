package com.example.controller;
import com.example.pojo.Role;
import com.example.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @descriotion
 * @author MARGIN
 * @data 2023/05/15/12:59
 */
@Controller
@RequestMapping("/role")
public class RoleController {
    @Autowired
    RoleService roleService;
    @GetMapping("/roles")
    public String selectRoles(Role role, Model model)throws Exception{
        List<Role> list = roleService.selectRoles(role);
        model.addAttribute("list",list);
        return "role/role";

    }
    @GetMapping("/addRole")
    public String addRole(Integer id, Model model) throws Exception {
        if(id != null){
            Role role = roleService.selectRole(id);
            model.addAttribute("role",role);
        }
        return "role/add";
    }
    @PostMapping("/saveAdd")
    public String saveAdd(Role role)throws Exception{
        if(role.getRoleId()!=null && role.getRoleId()>0){
            roleService.updateRole(role);
        }else {
            roleService.addRole(role);
        }
        return "redirect:/role/roles";
    }
    @GetMapping("deleteById")
    public String deleteRole(Integer id)throws Exception{
        roleService.deleteRole(id);
        return "redirect:/role/roles";
    }

}
