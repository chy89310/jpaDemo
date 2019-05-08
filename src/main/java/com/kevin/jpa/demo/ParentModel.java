package com.kevin.jpa.demo;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class ParentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    public ParentModel() {
    }

    public ParentModel(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "parent")
    @JsonManagedReference
    private List<ChildModel> childs;
}
