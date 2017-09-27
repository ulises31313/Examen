/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.examen.components;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import org.springframework.stereotype.Component;

/**
 *
 * @author ulise
 */
@Component
@Path("/message")
public class ClientesComponent {
    
    @GET
    @Produces("application/json")
    public String message(@QueryParam("message") String message) {
        return "Hola mundo";
}
    
}
