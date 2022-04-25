package vn.sps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.sps.entity.Book;
import vn.sps.repository.BookRepository;

@RestController
public class HelloController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping(value = "/hello")
    public Object hello() {
        Book book = new Book();
        book.setName("Java Book");
        return this.bookRepository.save(book);
    }
}
