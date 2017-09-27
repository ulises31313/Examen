/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.examen.servicesImpl;

import com.examen.examen.entity.Clientes;
import com.examen.examen.repository.ClientesRepository;
import com.examen.examen.services.ClientesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ulise
 */
@Service
@Transactional
public class ClientesServiceImpl implements ClientesService{

    @Autowired
    @Qualifier("ClientesRepository")
    private ClientesRepository clientesrepository;
    
    @Override
    public Clientes CrearCliente(Clientes cliente) {
         return clientesrepository.save(cliente);
    }

    @Override
    public List<Clientes> LeerClientes() {
        return clientesrepository.findAll();
    }
    
    @Override
    public Clientes ModificarCliente(Clientes cliente) {
      return clientesrepository.save(cliente);
    }

    @Override
    public void EliminarCliente(int id_cliente) {
      clientesrepository.delete(id_cliente);
    }
    
}
