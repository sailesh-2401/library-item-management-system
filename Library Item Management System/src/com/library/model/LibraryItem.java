package com.library.model;

public abstract class LibraryItem 
{
    private String itemId;      
    protected String title;     
    String author;              

    public LibraryItem(String itemId, String title, String author) 
    {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public void displayDetails() 
    {
        System.out.println("ID: " + itemId + " | Title: " + title + " | Author: " + author);
    }
}
