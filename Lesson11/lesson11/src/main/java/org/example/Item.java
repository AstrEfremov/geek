package org.example;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "item")
    private String item;

    @Column(name = "price")
    private int price;

    @ManyToMany(mappedBy = "buyers")
    private List<Item> items;

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", item='" + item + '\'' +
                ", price=" + price +
                ", items=" + items +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
