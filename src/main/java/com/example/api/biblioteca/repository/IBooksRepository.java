package com.example.api.biblioteca.repository;

import com.example.api.biblioteca.domain.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBooksRepository extends CrudRepository<Book, Long> {
}
