package com.binar.batch7.CH4.CH4_Pertemuan4.entity;

import lombok.Data;
import org.hibernate.annotations.Where;

import jakarta.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "training")
@Where(clause = "deleted_date is null")
public class Training extends AbstractDate implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "pengajar")
    private String pengajar;

    @Column(name = "tema")
    private String tema;

}
