/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.examen.controllers;

import com.examen.examen.entity.Clientes;
import com.examen.examen.services.ClientesService;
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
@RequestMapping("Clientes")
public class ClientesController {
    
    @Autowired()
    @Qualifier("ClientesServiceImpl")
    private ClientesService servicioclientes;
    
    @PostMapping("/Crear")
    @ResponseBody
    public String Crear(@ModelAttribute("Clientes") Clientes cliente)
    {
        servicioclientes.CrearCliente(cliente);
        return "Clientes Generado";
    }
    
    @GetMapping("/Leer")
    @ResponseBody
    public List<Clientes> Leer()
    {
        return servicioclientes.LeerClientes();
    }
    
    @PostMapping("/Modificar")
    @ResponseBody
    public Clientes Modificar(@ModelAttribute("Clientes") Clientes cliente)
    {
      return servicioclientes.ModificarCliente(cliente);
    }
    
    @PostMapping("/Eliminar")
    @ResponseBody
    public Clientes Eliminar(@ModelAttribute("Clientes") Clientes cliente)
    {
        servicioclientes.EliminarCliente(cliente.getId());
        return cliente;
    }
    
}
