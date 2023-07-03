package com.minicore.repositry;

import org.springframework.data.jpa.repository.JpaRepository;


import com.minicore.model.usuario;

public interface UsuarioRepository extends JpaRepository<usuario, Integer>{

}
