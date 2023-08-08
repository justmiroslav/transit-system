package org.kse.demo.ts.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Table (name = "city")
@NoArgsConstructor
@AllArgsConstructor
public class City {
    @Id
    private Integer id;

    @Column (name = "name")
    private String name;


}
