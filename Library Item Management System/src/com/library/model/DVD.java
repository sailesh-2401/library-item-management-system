package com.library.model;

public class DVD extends LibraryItem 
{
    private double duration;

    public DVD(String itemId, String title, String author, double duration) 
    {
        super(itemId, title, author);
        this.duration = duration;
    }

    @Override
    public void displayDetails() 
    {
        super.displayDetails();
        System.out.println("Type: DVD | Duration: " + duration + " mins");
    }
}
