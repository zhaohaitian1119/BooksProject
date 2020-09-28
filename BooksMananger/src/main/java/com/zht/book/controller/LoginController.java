package com.zht.book.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zht.book.pojo.BookInfo;
import com.zht.book.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.awt.print.Book;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-09-28 14:30
 */
@Controller
public class LoginController {

    @Resource
    LoginService loginService;

    @RequestMapping("/")
    public String tologin(){
        return "login";
    }

    @RequestMapping("/dologin")
    public String dologin(HttpSession session, HttpServletRequest request){
        String code = request.getParameter("code");
        String pwd = request.getParameter("pwd");
        int i = loginService.CountByCodeByPwd(code, pwd);
        if(i>0){
            session.setAttribute("userCode",code);
            return "redirect:/selAll";
        }else{
            session.setAttribute("error","用户名或密码错误");
            return "redirect:/";
        }

    }

    @RequestMapping("/selAll")
    public String selAll(HttpServletRequest request, Model model){
        String bookType = request.getParameter("bookType");
        String bookName = request.getParameter("bookName");
        String isBorrow = request.getParameter("isBorrow");
        String bookNames= "";
        Integer isBorrows = 2;
        Integer bookTypes = 0;
        if(isBorrow != null && !isBorrow.equals("")){
            isBorrows = Integer.parseInt(isBorrow);
        }
        if(bookType != null && !bookType.equals("")){
            bookTypes = Integer.parseInt(bookType);
        }
        if(bookName != null && !bookName.equals("")){
            bookNames = bookName;
        }
        int Num=1;
        String pageNum=request.getParameter("pageNum");
        if(pageNum != null && !pageNum.equals("")){
            Num=Integer.parseInt(pageNum);
        }
        int pageSize=3;
        PageHelper.orderBy("created_time desc");
        PageHelper.startPage(Num,pageSize);
        List<BookInfo> bookInfos = loginService.selAll(bookTypes,bookNames,isBorrows);
        if(bookInfos.size() == 0){
            model.addAttribute("bookType",bookTypes);
            model.addAttribute("isBorrow",isBorrows);
            model.addAttribute("bookName",bookNames);
            model.addAttribute("flag","true");
            model.addAttribute("msg","对不起,没有符合查询条件的结果");
        }else {
            PageInfo<BookInfo> bookPageInfo=new PageInfo<>(bookInfos);
            model.addAttribute("flag","false");
            model.addAttribute("bookType",bookTypes);
            model.addAttribute("isBorrow",isBorrows);
            model.addAttribute("bookName",bookNames);
            model.addAttribute("pageInfo",bookPageInfo);
        }

        return "index";
    }



}
