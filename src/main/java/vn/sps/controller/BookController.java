package vn.sps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vn.sps.entity.Book;
import vn.sps.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getAllBooks() {
        return this.bookService.getBooks();
    }

    @PostMapping
    public void addBook(@RequestBody Book book) {
        this.bookService.addBook(book);
    }
}
