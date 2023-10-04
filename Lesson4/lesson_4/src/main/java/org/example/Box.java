package org.example;

import org.example.fruit.Apple;
import org.example.fruit.Fruit;
import org.example.fruit.Orange;

import java.util.ArrayList;
import java.util.List;

public class Box{
    List<Fruit> box = new ArrayList<>();

    public void BoxA(Apple apple) {
        box.add(apple);
    }
    public void BoxB(Orange orange) {
        box.add(orange);
    }
    public void newBox(Fruit fruit){
        box.add(fruit);
    }
    public void getWeight(){
        if (box.get(0).getClass().getSimpleName().equals("Apple")){
        System.out.println("Вес коробки с яблоками = "+box.size()*1.0);}
        else System.out.println("Вес коробки с апельсинами = "+box.size()*1.5);
    }

    public void compare(Box o) {
        System.out.println((int)(this.box.size()*1.5 - o.box.size()) == 0);
    }
    public void pourOver(){
        for (int i = 0; i < this.box.size(); i++) {
            newBox(this.box.get(i));
            this.box.remove(this.box.get(i));
        }
        }
}
