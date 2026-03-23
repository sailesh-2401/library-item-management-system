package com.library.service;

import com.library.model.LibraryItem;
import java.util.ArrayList;
import java.util.List;

public class LibraryService 
{
    private List<LibraryItem> items = new ArrayList<>();

    public void addItem(LibraryItem item)
    {
        items.add(item);
    }

    public List<LibraryItem> getItems() 
    {
        return this.items;
    }

    public void displayAllItems() 
    {
        System.out.println("--- Library Inventory ---");
        for (LibraryItem item : items) 
        {
            item.displayDetails();
            System.out.println("-----------------------");
        }
    }
}