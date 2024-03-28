package com.learn2code.veihcle.api.search.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



@Entity
@Table(name = "manufacture_year")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class ManufacturYear {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    private  int year ;
}
