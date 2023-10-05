package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
       PhoneBook pb = new PhoneBook();
    pb.addContact("John", "8-92712931283");
    pb.addContact("John", "8-92712931283");
    pb.addContact("John", "8-92712931283");
    pb.addContact("John", "8-927123112931283");
    pb.addContact("John", "8-92711231412931283");
    pb.addContact("John", "8-92712434931283");
    pb.addContact("John", "8-9271291231431283");
    pb.addContact("Mike", "13123");
        pb.getPhone("Mike");
    }
}