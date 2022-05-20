package com.example.classDependencyInjectionv1.service;

import com.example.classDependencyInjectionv1.model.Book;

import java.util.Optional;

public interface IBookService {
    Book createBook(Book book);
    Optional<Book> findByIdBook(String idBook);
}
