package com.example.Miniproject2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.Miniproject2.BookService;
import com.example.Miniproject2.Book;

import java.util.ArrayList;

@RestController
public class BookController {
    @Autowired
    private BookH2Service bookH2Service;

    @GetMapping("/books")
    public ArrayList<Book> getAllBooks(){
        return bookH2Service.getBooks();

    }

    @GetMapping("/books/{bookId}")
    public Book getBookById(@PathVariable("bookId") int bookId){

        return bookH2Service.getBookById(bookId);
    }

    @PostMapping("/books")
    public Book addBook(@RequestBody Book book){

        return bookH2Service.addBook(book);
    }

    @PutMapping("books/{bookId}")
    public Book updateBook(@PathVariable("bookId") int bookId, @RequestBody Book book){
        return bookH2Service.updateBook(bookId,book);
    }

    @DeleteMapping("books/{bookId}")
    public void deleteBook(@PathVariable("bookId") int bookId){

        bookH2Service.deleteBook(bookId);
    }






}
