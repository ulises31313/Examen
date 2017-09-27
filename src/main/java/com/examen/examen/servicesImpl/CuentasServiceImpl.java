/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.examen.servicesImpl;

import com.examen.examen.entity.Cuentas;
import com.examen.examen.entity.Operaciones;
import com.examen.examen.repository.CuentasRepository;
import com.examen.examen.repository.OperacionesRepository;
import com.examen.examen.services.CuentasService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author ulise
 */
@Service("CuentasServiceImpl")
public class CuentasServiceImpl implements CuentasService{

    @Autowired
    @Qualifier("CuentasRepository")
    private CuentasRepository cuentasrepository;
    
    @Autowired
    @Qualifier("OperacionesRepository")
    private OperacionesRepository operacionesrepository;
    
    public Date fecha = new Date();
    
    @Override
    public Cuentas CrearCuenta(Cuentas cuenta) {
       Operaciones operacion = new Operaciones();
       operacion.setId_cuenta(cuenta.getId());
       operacion.setFecha_creacion(fecha);
       operacion.setFecha_modificacion(fecha);
       operacionesrepository.save(operacion);
       return cuentasrepository.save(cuenta);
    }

    @Override
    public List<Cuentas> LeerCuenta() {
       return cuentasrepository.findAll();
    }

    @Override
    public Cuentas ModificarCuenta(Cuentas cuenta) {
       Operaciones operacion = new Operaciones();
       operacion.setId_cuenta(cuenta.getId());
       operacion.setFecha_creacion(fecha);
       operacion.setFecha_modificacion(fecha);
       operacionesrepository.save(operacion);
      return cuentasrepository.save(cuenta);
    }

    @Override
    public void EliminarCuenta(int id_cuenta) {
       Operaciones operacion = new Operaciones();
       operacion.setId_cuenta(id_cuenta);
       operacion.setFecha_creacion(fecha);
       operacion.setFecha_modificacion(fecha);
       operacionesrepository.save(operacion);
      cuentasrepository.delete(id_cuenta);
    }
    
}
