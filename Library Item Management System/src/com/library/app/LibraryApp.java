package com.library.app;

import com.library.model.*;
import com.library.service.LibraryService;

public class LibraryApp {
    public static void main(String[] args) {
        LibraryService service = new LibraryService();

        // 1. Creating specific objects
        Book myBook = new Book("B001", "Java Programming", "John Smith", 500);
        Magazine myMag = new Magazine("M001", "Tech Monthly", "Editorial Board", "April 2026");
        DVD myDvd = new DVD("V001", "Interstellar", "Christopher Nolan", 169.0);

        // 2. Storing them in the Service (which uses the List<LibraryItem>)
        service.addItem(myBook);
        service.addItem(myMag);
        service.addItem(myDvd);

        // 3. Calling displayDetails() for every item in the library
        for (LibraryItem item : service.getItems()) {
            item.displayDetails(); 
            System.out.println("-----------------------");
        }
    }
}
