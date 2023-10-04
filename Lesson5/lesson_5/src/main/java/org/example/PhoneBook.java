package org.example;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class PhoneBook {
    HashMap<String, LinkedHashSet<String>> phoneBook;
    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public PhoneBook(HashMap<String, LinkedHashSet<String>> phoneBook) {
        this.phoneBook = phoneBook;
    }
    public void addContact (String a, String b){
        if (!phoneBook.containsKey(a)){
            phoneBook.put(a, new LinkedHashSet<>(Collections.singleton(a)));
            phoneBook.get(a).add(b);
        }
        else phoneBook.get(a).add(b);
    }
    public void getPhone (String a){
        System.out.println(phoneBook.get(a));
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneBook=" + phoneBook +
                '}';
    }
}
