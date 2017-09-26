/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.examen.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ulise
 */
@Entity
@Table(name="Operaciones")
public class Operaciones implements Serializable {
    
        @Id
	@Column(name = "id")
	private int id;
        @Column(name = "id_cuenta")
	private int id_cuenta;
        @Column(name = "total_operacion")
	private String total_operacion;
        @Column(name = "fecha_creacion")
	private Date fecha_creacion;
        @Column(name = "fecha_modificacion")
	private Date fecha_modificacion;

    public Operaciones(int id, int id_cuenta, String total_operacion, Date fecha_creacion, Date fecha_modificacion) {
        this.id = id;
        this.id_cuenta = id_cuenta;
        this.total_operacion = total_operacion;
        this.fecha_creacion = fecha_creacion;
        this.fecha_modificacion = fecha_modificacion;
    }

    public Operaciones() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(int id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    public String getTotal_operacion() {
        return total_operacion;
    }

    public void setTotal_operacion(String total_operacion) {
        this.total_operacion = total_operacion;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public Date getFecha_modificacion() {
        return fecha_modificacion;
    }

    public void setFecha_modificacion(Date fecha_modificacion) {
        this.fecha_modificacion = fecha_modificacion;
    }
        
        
    
}
