package com.wad.lab2.service;

//TODO: Implement BookService with appropriate methods for managing books

import com.wad.lab2.model.Book;
import com.wad.lab2.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    public void howToCallRepositoryMethod(Book book) {
        bookRepository.save(book);
        bookRepository.findAll();
        bookRepository.findById(book.getId());
    }
}
