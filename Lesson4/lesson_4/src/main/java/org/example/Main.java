package org.example;

import org.example.fruit.Apple;
import org.example.fruit.Orange;

public class Main {
    public static void main(String[] args) {
    Box boxApple = new Box();
    Box boxOranges = new Box();
    boxApple.BoxA(new Apple());
    boxOranges.BoxB(new Orange());
    boxOranges.BoxB(new Orange());
    boxOranges.BoxB(new Orange());
    boxOranges.BoxB(new Orange());
    boxOranges.BoxB(new Orange());
    boxOranges.BoxB(new Orange());
    boxOranges.compare(boxApple);
    boxApple.getWeight();
    boxOranges.getWeight();
    Box b = new Box();
    boxApple.pourOver();
    boxApple.getWeight();

    }

}