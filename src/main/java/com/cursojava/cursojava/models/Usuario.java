package com.cursojava.cursojava.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @Getter @Setter @Column(name = "Id")
    private long id;
    @Getter @Setter @Column(name = "Nombre")
    private String nombre;
    @Getter @Setter @Column(name = "Apellido")
    private  String apellido;
    @Getter @Setter @Column(name = "Correo")
    private String correo;
    @Getter @Setter @Column(name = "Telefono")
    private String telefono;
    @Getter @Setter @Column(name = "Contrasena")
    private String contrasena;
}
