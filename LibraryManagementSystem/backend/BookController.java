package com.bookstore.controller;

import com.bookstore.model.Book;
import com.bookstore.model.Cart;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private List<Book> bookList = new ArrayList<>();
    private Cart cart = new Cart();

    public BookController() {
        addBooks();
    }

    private void addBooks() {
        bookList.add(new Book(2301, "Introduction to Computer Science", "Parry Donham", "download1", 200, 50));
        bookList.add(new Book(2302, "IndoBangla | Handbook of Computer Science & IT", "Arihant Experts", "download2", 220, 60));
        // Add the rest of the books here...
    }

    @GetMapping("/")
    public List<Book> getAllBooks() {
        return bookList;
    }

    @GetMapping("/{bookId}")
    public Book getBookById(@PathVariable int bookId) {
        for (Book book : bookList) {
            if (book.getBookId() == bookId) {
                return book;
            }
        }
        return null;
    }

    @PostMapping("/addToCart/{bookId}")
    public String addToCart(@PathVariable int bookId) {
        Book book = getBookById(bookId);
        if (book != null) {
            cart.addToCart(book);
            return "✅ Book added to cart: " + book.getName();
        } else {
            return "Book not found.";
        }
    }

    @GetMapping("/cart")
    public String getCartSummary() {
        return "🛒 Total Items: " + cart.getTotalItems() + "\n💰 Total Price: ৳" + cart.getTotalPrice();
    }
}
