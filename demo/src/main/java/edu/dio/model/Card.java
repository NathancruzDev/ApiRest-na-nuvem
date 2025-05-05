package edu.dio.model;

import jakarta.persistence.*;

@Entity(name="tb_cards")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;
    @Column(name="available_limit",scale= 13,precision=2)
    private String numberLimit;

    public Long getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumberLimit() {
        return numberLimit;
    }

    public void setNumberLimit(String numberLimit) {
        this.numberLimit = numberLimit;
    }

}
