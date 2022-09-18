package com.prod.productmanagement.model;

import javax.persistence.*;
import java.math.BigDecimal;
@Entity
@Table(name = "products")
public class Product {
    private long id;
    private String _title;
    private String _description;
    private BigDecimal _unitPrice;

  public Product() {

    }

    public Product(String title, String description, BigDecimal unitPrice) {
        this._title = title;
        this._description = description;
        this._unitPrice = unitPrice;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    @Column(name = "Title", nullable = false)
    public String getTitle() {
        return _title;
    }
    public void setTitle(String title) {
        this._title = title;
    }

    @Column(name = "Description", nullable = false)
    public String getDescription() {
        return _description;
    }

    @Column(name = "Description", nullable = false)
    public void setDescription(String description) {
        this. _description = description;
    }

    @Column(name = "UnitPrice", nullable = false)
    public BigDecimal getUnitPrice() {
        return _unitPrice;
    }

    @Column(name = "UnitPrice", nullable = false)
    public void setUnitPrice(BigDecimal unitPrice) {
        this. _unitPrice= unitPrice;
    }
}
