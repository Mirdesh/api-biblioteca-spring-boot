package com.example.api.biblioteca.service.impl;

import com.example.api.biblioteca.domain.dto.BookDto;
import com.example.api.biblioteca.domain.entity.Book;
import com.example.api.biblioteca.repository.IBooksRepository;
import com.example.api.biblioteca.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookService implements IBookService {

    @Autowired
    private IBooksRepository booksRepository;

    @Override
    public List<Book> findAll() {
        return (List<Book>) booksRepository.findAll();
    }
}
