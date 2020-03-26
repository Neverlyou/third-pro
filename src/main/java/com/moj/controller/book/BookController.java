package com.moj.controller.book;

import com.moj.entity.Book;
import com.moj.mapper.MovieNameMapper;
import com.moj.service.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by 刘鑫宇 on 2020/3/23 15:11
 */
@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookServiceImpl bookService;
   /* @Autowired
    private MovieNameMapper movieNameMapper;*/

    // 初始化图书信息
    @RequestMapping(value = "/init")
    public ModelAndView bookInit(/*HttpServletRequest request,*/ ModelAndView model){
        //UserInformation userInformation = (UserInformation) request.getSession().getAttribute("userInformation");
        List<Book> entities = bookService.findAllBook();
        for (Book entity : entities) {
            entity.setTranslator(entity.getTranslator().replace("[\"", "").replace("\"]", "").replace("\"", ""));
            entity.setAuthor(entity.getAuthor().replace("[\"", "").replace("\"]", "").replace("\"", ""));
        }
        model.addObject("entity",entities);
        model.setViewName("book/init");
        //model.addAttribute("entity", entities);
        /*model.addAttribute("myFriends", userController.getMyFriends(userInformation.getId()));
        model.addAttribute("userInformation", userInformation);
        model.addAttribute("username", userInformation.getName());
        model.addAttribute("autograph", userInformation.getAutograph());
        model.addAttribute("action", 7);*/
       // userController.getUserCounts(model, userInformation.getId());

        return model;
    }

    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("result",bookService.findAllBook());
        modelAndView.setViewName("book/book_information");
        return modelAndView;
        //return movieNameMapper.findAll().toString();
    }
}
