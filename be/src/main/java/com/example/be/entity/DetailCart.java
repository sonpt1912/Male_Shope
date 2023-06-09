package com.example.be.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "detail_cart")
@IdClass(DetailCartId.class)
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Setter
@Getter
public class DetailCart {

    @Id
    @ManyToOne()
    @JoinColumn(name = "id_cart", nullable = false, referencedColumnName = "id")
    private Cart cart;

    @Id
    @ManyToOne()
    @JoinColumn(name = "id_detail_product", nullable = false, referencedColumnName = "id")
    private DetailProduct detailProduct;

    @Column(name = "quantity")
    private Integer quantity;

}
