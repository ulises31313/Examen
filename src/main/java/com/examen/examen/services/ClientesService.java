/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.examen.services;

import com.examen.examen.entity.Clientes;
import java.util.List;

/**
 *
 * @author ulise
 */
public interface ClientesService {
    
    public abstract Clientes CrearCliente(Clientes cliente);
    
    public abstract List<Clientes> LeerClientes();
    
    public abstract Clientes ModificarCliente(Clientes cliente);
    
    public abstract void EliminarCliente(int id_cliente);
    
}
