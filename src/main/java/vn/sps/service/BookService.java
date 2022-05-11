package vn.sps.service;

import vn.sps.entity.Book;

import java.util.List;

public interface BookService {

    List<Book> getBooks();

    void addBook(Book book);
}
