package org.example.onlinrshop.model.entity;

import jakarta.persistence.*;

import javax.xml.crypto.Data;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="product")
public class Product extends BaseEntity{
    private String name;
    private BigDecimal price;

    private String description;
    private Date last_update;

    private Category category;

    @Column(name = "name", length =45, nullable = false )

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    @Column(columnDefinition = "Text")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Basic(optional = false)
    @Column(name="last_update", insertable = false, updatable = false,columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getLast_update() {
        return last_update;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }
    @ManyToOne
    @JoinColumn(name="category_id", nullable = false)
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
