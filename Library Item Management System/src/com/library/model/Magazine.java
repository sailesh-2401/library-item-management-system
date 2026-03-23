package com.library.model;
public class Magazine extends LibraryItem
{
    private String issueDate;

    public Magazine(String itemId, String title, String author, String issueDate) 
    {
        super(itemId, title, author);
        this.issueDate = issueDate;
    }

    @Override
    public void displayDetails() 
    {
        super.displayDetails();
        System.out.println("Type: Magazine | Issue: " + issueDate);
    }
}
