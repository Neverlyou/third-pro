package com.moj.controller.user;

import com.moj.entity.Book;
import com.moj.mapper.MovieNameMapper;
import com.moj.service.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 刘鑫宇 on 2020/3/23 15:11
 */
@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookServiceImpl bookService;
    @Autowired
    private MovieNameMapper movieNameMapper;

    @RequestMapping("/findAll")
    public String findAll(){
        //return bookService.findAllBook().toString();
        return movieNameMapper.findAll().toString();
    }
}
