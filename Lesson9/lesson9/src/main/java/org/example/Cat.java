package org.example;

@Table(title = "Cats")
public class Cat {

    @Column
    int id;

    @Column
    String name;

    @Column
    int age;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Cat(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
