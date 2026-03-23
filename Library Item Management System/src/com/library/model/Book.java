package com.library.model;
public class Book extends LibraryItem {
    private int pageCount;

    public Book(String itemId, String title, String author, int pageCount) {
        super(itemId, title, author);
        this.pageCount = pageCount;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Book | Pages: " + pageCount);
    }
}
