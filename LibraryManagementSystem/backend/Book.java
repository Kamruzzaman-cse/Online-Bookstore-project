package com.bookstore.model;

public class Book {
    private int bookId;
    private String name;
    private String author;
    private String filename;
    private int price;
    private int stock;

    public Book(int bookId, String name, String author, String filename, int price, int stock) {
        this.bookId = bookId;
        this.name = name;
        this.author = author;
        this.filename = filename;
        this.price = price;
        this.stock = stock;
    }

    public int getBookId() {
        return bookId;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getFilename() {
        return filename;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    // Getters and Setters omitted for brevity
}
