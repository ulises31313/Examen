/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.examen.repository;

import com.examen.examen.entity.Cuentas;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ulise
 */
@Repository("CuentasRepository")
public interface CuentasRepository extends JpaRepository<Cuentas, Serializable>{
    
}
