/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.examen.controllers;

import com.examen.examen.entity.Clientes;
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
@RequestMapping("Clientes")
public class ClientesController {
    
    @PostMapping("/Crear")
    @ResponseBody
    public String Crear(@ModelAttribute("Clientes") Clientes cliente)
    {
        return "Hola";
    }
    
    @GetMapping("/Leer")
    @ResponseBody
    public Clientes Leer()
    {
        Clientes cliente = new Clientes();
        cliente.setApellidoMaterno("ulises");
        return cliente;
    }
    
    @PostMapping("/Modificar")
    @ResponseBody
    public Clientes Modificar(@ModelAttribute("Clientes") Clientes cliente)
    {

        return cliente;
    }
    
    @PostMapping("/Eliminar")
    @ResponseBody
    public Clientes Eliminar(@ModelAttribute("Clientes") Clientes cliente)
    {
        cliente.setApellidoPaterno("Test");
        return cliente;
    }
    
}
