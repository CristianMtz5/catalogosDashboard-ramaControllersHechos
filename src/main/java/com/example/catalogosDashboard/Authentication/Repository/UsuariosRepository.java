package com.example.catalogosDashboard.Authentication.Repository;

import com.example.catalogosDashboard.Authentication.Entity.UsuariosEntity;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosRepository extends JpaRepository<UsuariosEntity, Integer>{
    Optional<UsuariosEntity> findOneByEmail(String email);    
}
