package com.jcode.crudprecios.product;

import jakarta.persistence.*;


import java.time.LocalDate;
@Entity
@Table
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private float price;
    private LocalDate date;
    private int antiquity;


    public Product() {
    }

    public Product(Long id, String nombre, float price, LocalDate date, int antiquity) {
        this.id = id;
        this.nombre = nombre;
        this.price = price;
        this.date = date;
        this.antiquity = antiquity;
    }

    public Product(String nombre, float price, LocalDate date, int antiquity) {
        this.nombre = nombre;
        this.price = price;
        this.date = date;
        this.antiquity = antiquity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getAntiquity() {
        return antiquity;
    }

    public void setAntiquity(int antiquity) {
        this.antiquity = antiquity;
    }
}
