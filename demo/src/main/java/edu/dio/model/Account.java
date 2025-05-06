package edu.dio.model;


import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name="tb_account")
public class Account {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, length = 9)
    private String number;
    @Column(length = 3)
    private String agency;
    @Column(precision = 13, scale = 2)
    private BigDecimal balance;
    @Column(name="additional_limit",scale = 2, precision =13)
    private BigDecimal limit;
    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "pix_id", referencedColumnName = "id")
    private Pix pix;

    public Pix getPix() {
        return pix;
    }
    public String getPixKey() {
        return pix.getPixKey();
    }

}
