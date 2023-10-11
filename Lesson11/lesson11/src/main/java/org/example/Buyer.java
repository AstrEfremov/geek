package org.example;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "buyers")
public class Buyer {
    @OneToOne
    @JoinColumn(referencedColumnName = "Item_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "buyer_name")
    private String buyer_name;

    @ManyToMany
    @JoinTable(
            name = "purchases",
            joinColumns = @JoinColumn(name = "buyer_id"),
            inverseJoinColumns = @JoinColumn (name = "item_id")
    )
        private List<Buyer> buyers;

    @Override
    public String toString() {
        return "Buyer{" +
                "id=" + id +
                ", buyer_name='" + buyer_name + '\'' +
                ", buyers=" + buyers +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBuyer_name() {
        return buyer_name;
    }

    public void setBuyer_name(String buyer_name) {
        this.buyer_name = buyer_name;
    }

    public List<Buyer> getBuyers() {
        return buyers;
    }

    public void setBuyers(List<Buyer> buyers) {
        this.buyers = buyers;
    }

    public Buyer() {
    }
}
