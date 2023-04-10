package com.example.catalogosDashboard.Authentication.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="usuarios")
public class UsuariosEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String nombre;
    @Column 
    private String apellidos;
    @Column 
    private String compañia;
    @Column 
    private String email;
    @Column 
    private String estado;
    @Column 
    private String ciudad;
    @Column 
    private String codigoPostal;
    @Column 
    private String about;
    @Column
    private String password;
}
