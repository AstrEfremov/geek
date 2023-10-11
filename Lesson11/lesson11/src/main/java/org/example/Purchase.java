package org.example;

import javax.persistence.*;

@Entity
@Table(name = "purchases")
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "buyer_id")
    private int buyer_id;

    @Column(name = "item_id")
    private int item_id;


    @Column(name = "item_price")
    private int item_price;



}
