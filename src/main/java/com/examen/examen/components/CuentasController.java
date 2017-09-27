/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.examen.components;

import com.examen.examen.entity.Clientes;
import com.examen.examen.entity.Cuentas;
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
    
     @PostMapping("/Crear")
    @ResponseBody
    public String Crear(@ModelAttribute("Cuentas") Cuentas cuenta)
    {
        return "Hola";
    }
    
    @GetMapping("/Leer")
    @ResponseBody
    public Cuentas Leer()
    {
        Cuentas cuenta = new Cuentas();
        cuenta.setSaldo("1000");
        return cuenta;
    }
    
    @PostMapping("/Modificar")
    @ResponseBody
    public Cuentas Modificar(@ModelAttribute("Cuentas") Cuentas cuenta)
    {

        return cuenta;
    }
    
    @PostMapping("/Eliminar")
    @ResponseBody
    public Cuentas Eliminar(@ModelAttribute("Cuentas") Cuentas cuenta)
    {
        cuenta.setId_cliente(0);
        return cuenta;
    }
}
