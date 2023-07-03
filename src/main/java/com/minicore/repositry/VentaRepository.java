package com.minicore.repositry;


import org.springframework.data.jpa.repository.JpaRepository;


import com.minicore.model.venta;

public interface VentaRepository extends JpaRepository<venta, Integer> {

}
