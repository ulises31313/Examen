/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.examen.controllers;

import com.examen.examen.entity.Cuentas;
import com.examen.examen.services.CuentasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author ulise
 */
@Controller
@RequestMapping("Cuentas")
public class CuentasController {
    
    @Autowired()
    @Qualifier("CuentasServiceImpl")
    private CuentasService serviciocuentas;
    
    @PostMapping("/Crear")
    @ResponseBody
    public String Crear(@ModelAttribute("Cuentas") Cuentas cuenta)
    {
        serviciocuentas.CrearCuenta(cuenta);
        return "Cuenta generada correctamente";
    }
    
    @GetMapping("/Leer")
    @ResponseBody
    public List<Cuentas> Leer()
    {
        return serviciocuentas.LeerCuenta();
    }
    
    @PostMapping("/Modificar")
    @ResponseBody
    public Cuentas Modificar(@ModelAttribute("Cuentas") Cuentas cuenta)
    {
      return serviciocuentas.ModificarCuenta(cuenta);
    }
    
    @PostMapping("/Eliminar")
    @ResponseBody
    public Cuentas Eliminar(@ModelAttribute("Cuentas") Cuentas cuenta)
    {
        serviciocuentas.EliminarCuenta(cuenta.getId());
        return cuenta;
    }
}
