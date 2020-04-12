package com.example.api.biblioteca.controller;

import com.example.api.biblioteca.domain.entity.Book;
import com.example.api.biblioteca.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/book")
@Validated
public class BookController {

    @Autowired
    private IBookService bookService;

    @GetMapping
    public List<Book> findAll() {
        return bookService.findAll();
    }
}
