package qin.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import qin.com.entity.Admin;
import qin.com.service.AdminService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller //这是控制器的的注解，代码当前类为一个控制器
@RequestMapping("/admin")  //这个注解表示控制器的映射的地址为服务器地址+admin
public class AdminController {
    @Resource(name="adminServiceImpl")  //这个注解表示自动注入adminSeerviceImpl业务实现类
    @Autowired  //表示紧跟后面的字段进行封装（即getter和setter）
    private AdminService adminService;  //这是与上面注入的业务实现类的接口

    @RequestMapping("/delete")
    @ResponseBody
    public void deleteByPrimaryKey(Integer id){

    }

    @RequestMapping("/insert")
    @ResponseBody
    public void insert(Admin record){

    }

    @RequestMapping("/insertSelective")
    @ResponseBody
    public void insertSelective(Admin record){}

    @RequestMapping("/list")
    @ResponseBody
    public Admin list(HttpServletRequest request, HttpServletResponse response){
        Admin admin=adminService.selectByPrimaryKey(1);
        System.out.println(admin.getName());
        return admin;
    }

//    @RequestMapping("/listall")
//    @ResponseBody
//    public List<Admin> listall(HttpServletRequest request, HttpServletResponse response){
//        List<Admin> adminlist=adminService.selectAll();
//        return adminlist;
//    }

    @RequestMapping("/updateByPrimaryKeySelective")
    @ResponseBody
    public void updateByPrimaryKeySelective(Admin record){

    }

    @RequestMapping("/updateByPrimaryKey")
    @ResponseBody
    public void updateByPrimaryKey(Admin record){

    }
}