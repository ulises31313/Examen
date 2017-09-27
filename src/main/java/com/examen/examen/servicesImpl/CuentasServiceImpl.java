/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.examen.servicesImpl;

import com.examen.examen.entity.Cuentas;
import com.examen.examen.repository.ClientesRepository;
import com.examen.examen.repository.CuentasRepository;
import com.examen.examen.repository.OperacionesRepository;
import com.examen.examen.services.CuentasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 *
 * @author ulise
 */
public class CuentasServiceImpl implements CuentasService{

    @Autowired
    @Qualifier("CuentasRepository")
    private CuentasRepository cuentasrepository;
    
    @Autowired
    @Qualifier("OperacionesRepository")
    private OperacionesRepository operacionesrepository;
    
    @Override
    public Cuentas CrearCuenta(Cuentas cuenta) {
       return cuentasrepository.save(cuenta);
    }

    @Override
    public List<Cuentas> LeerCuenta() {
       return cuentasrepository.findAll();
    }

    @Override
    public Cuentas ModificarCuenta(Cuentas cuenta) {
      return cuentasrepository.save(cuenta);
    }

    @Override
    public void EliminarCuenta(int id_cuenta) {
      cuentasrepository.delete(id_cuenta);
    }
    
}
