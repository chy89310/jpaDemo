package com.kevin.jpa.demo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class ChildModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    public ChildModel() {
    }

    public ChildModel(String name) {
        this.name = name;
    }

    @ManyToOne
    @JoinColumn
    @JsonBackReference
    private ParentModel parent;
}
