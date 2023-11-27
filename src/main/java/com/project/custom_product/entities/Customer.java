package com.project.custom_product.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.annotation.Nonnull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;



@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Data
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Integer customer_id;

    @Nonnull
    @Column(name = "first_name", nullable = false)
    private String first_name;

    @Nonnull
     @Column(name = "last_name", nullable = false)
    private String last_name;


    private String password;

   
    @Column(name = "address")
    private String address;

  
    @Column(name = "telefon_number")
    private String telefon_number;

//     @JsonIgnore
//     @OneToMany(mappedBy = "customer",cascade =  CascadeType.ALL)
//     @JoinColumn(name = "customer_id", referencedColumnName = "prod_id")
//     private List<Product> product_list;
 }