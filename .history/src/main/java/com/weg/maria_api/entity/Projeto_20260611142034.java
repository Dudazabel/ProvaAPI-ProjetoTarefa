package com.weg.maria_api.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "projeto")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Projeto {

    @Id
    @GeneratedValue(strategy = Generatio)

}
