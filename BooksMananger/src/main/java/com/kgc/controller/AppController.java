package com.kgc.controller;

import com.github.pagehelper.PageInfo;
import com.kgc.pojo.Info;
import com.kgc.pojo.Users;
import com.kgc.service.InfoService;
import com.kgc.service.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class AppController {

    @Resource
    UsersService usersService;
    @Resource
    InfoService infoService;

    /*
     * 跳转登录页面的控制器
     *
     * */
    @RequestMapping("/")
    public String toindex() {
        return "index";
    }

    /*
     * 登录功能控制器
     * */
    @RequestMapping("/doIndex")
    public String doIndex(String userCode, String password, Model model, HttpSession session) {

        if (userCode == "" || userCode.isEmpty()) {
            model.addAttribute("error", "登录账户不能为空");
            return "index";
        }
        Users users = usersService.selectByUserCode(userCode);
        if (users == null) {
            model.addAttribute("error", "登录账户不存在");
            return "index";
        }
        if (users.getPassword().equals(password) == false) {
            model.addAttribute("error", "登录密码错误，请重试");
            return "index";
        }
        session.setAttribute("users", users);
        return "redirect:/Usersel";
    }

    /*
     *查询info列表控制器
     * */
    @RequestMapping("/Usersel")
    public String Usersel(@RequestParam(value = "bookType", required = false, defaultValue = "0") Integer bookType,
                          @RequestParam(value = "bookName", required = false, defaultValue = "") String bookName,
                          @RequestParam(value = "isBorrow", required = false, defaultValue = "0") Integer isBorrow,
                          @RequestParam(value = "pageNum", required = false, defaultValue = "1") Integer pageNum, Model model) {
        Integer pageSize = 3;
        List<Info> infos = infoService.selectByTypeAndNameAndisBorrow(bookType, bookName, isBorrow, pageNum, pageSize);
        PageInfo<Info> pageInfo = new PageInfo<>(infos);
        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("bookType", bookType);
        model.addAttribute("bookName", bookName);
        model.addAttribute("isBorrow", isBorrow);
        return "main";
    }

}
