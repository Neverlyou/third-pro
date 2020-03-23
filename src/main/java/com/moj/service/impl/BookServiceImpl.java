package com.moj.service.impl;

import com.moj.entity.Book;
import com.moj.entity.Moviename;
import com.moj.mapper.BookMapper;
import com.moj.mapper.MovieNameMapper;
import com.moj.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 刘鑫宇 on 2020/3/23 15:05
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private  BookMapper bookMapper;
    @Autowired
    private MovieNameMapper movieNameMapper;
    @Override
    public List<Book> findAllBook() {
        return bookMapper.findAllBook();
    }

    @Override
    public List<Book> findByTit(String title) {
        return bookMapper.findByTit(title);
    }

    @Override
    public List<Book> findByAut(String author) {
        return bookMapper.findByAut(author);
    }

    @Override
    public Moviename findAll() {
        return movieNameMapper.findAll();
    }
}
