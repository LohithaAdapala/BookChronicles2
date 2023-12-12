package com.example.Miniproject2;

import java.util.ArrayList;
import com.example.Miniproject2.Book;
import org.springframework.web.bind.annotation.PathVariable;

public interface BookRepository {
    ArrayList<Book> getBooks();
    Book getBookById(int bookId);
    Book addBook(Book book);
    Book updateBook(int bookId,Book book);
    void deleteBook(int bookId);
}
