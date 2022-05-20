package com.example.classDependencyInjectionv1.service;

import com.example.classDependencyInjectionv1.model.Book;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Optional;
@Service
public class ImplBookService implements IBookService{
    private final HashMap<String,Book> bookHashMap = new HashMap<>();
    @Override
    public Book createBook(Book book) {
        bookHashMap.put(book.getIdBook(),book);
        return  book;
    }

    @Override
    public Optional<Book> findByIdBook(String idBook) {
         Book book = bookHashMap.get(idBook);
         return book != null ? Optional.of(book) : Optional.empty();
    }
}
