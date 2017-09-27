/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.examen.services;

import com.examen.examen.entity.Cuentas;
import java.util.List;

/**
 *
 * @author ulise
 */
public interface CuentasService {
    
    public abstract Cuentas CrearCuenta(Cuentas cuenta);
    
    public abstract List<Cuentas> LeerCuenta();
    
    public abstract Cuentas ModificarCuenta(Cuentas cuenta);
    
    public abstract void EliminarCuenta(int id_cuenta);
    
}
