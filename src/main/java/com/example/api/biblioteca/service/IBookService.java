package com.example.api.biblioteca.service;

import com.example.api.biblioteca.domain.dto.BookDto;
import com.example.api.biblioteca.domain.entity.Book;

import java.util.List;

public interface IBookService {

    List<Book> findAll();
}
