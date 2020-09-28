package com.kgc.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.pojo.Book_info;
import com.kgc.pojo.Users;
import com.kgc.servlce.BookServlce;
import com.kgc.servlce.UserServlce;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class BookController {
    @Resource
    UserServlce userService;
    @Resource
    BookServlce bookService;

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/doLogin")
    public String doLogin(String user_code, String password, HttpSession session){
        Users users = userService.selectUser(user_code);
        if(users==null){
            session.setAttribute("没有该用户","loginmsg");
            return "login";
        }else if(password.equals(users.getPassword())==false){
            session.setAttribute("密码错误","loginmsg");
            return "login";
        }
        session.setAttribute("users",users);
        return "redirect:selectBook";
    }

    @RequestMapping("/selectBook")
    public String selectBook(Model model, String book_name, Integer book_type, Integer is_borrow, HttpServletRequest request){
        int Num=1;
        String pageNum=request.getParameter("pageNum");
        if(pageNum!=null){
            Num=Integer.parseInt(pageNum);
        }
        int pageSize=4;
        List<Book_info> book_infos = bookService.selectBook(book_type, is_borrow, book_name, Num, pageSize);
        PageHelper.startPage(Num,pageSize);
        PageHelper.orderBy("book_id asc");
        PageInfo pageInfo=new PageInfo(book_infos);
        model.addAttribute("pageInfo",pageInfo);
        return "index";
    }

    @RequestMapping("/tuichu")
    public String tuichu(HttpSession session){
        session.invalidate();
        return "/jsp/login";
    }
}

