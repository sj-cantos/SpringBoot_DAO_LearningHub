package com.example.database.services;
import com.example.database.domain.entities.BookEntity;

import java.util.List;
import java.util.Optional;

public interface BookService
{
    BookEntity createUpdate(BookEntity bookEntity, String isbn);
    List<BookEntity> findAll();

    Optional<BookEntity> findOne(String isbn);

    List<BookEntity> findByAuthorId(Long id);

    boolean isExists(String isbn);

    BookEntity partialUpdate(String isbn, BookEntity bookEntity);

    void delete(String isbn);
}
