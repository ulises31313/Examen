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
@Table(name="Cuentas")
public class Cuentas  implements Serializable{
    
        @Id
	@Column(name = "id")
	private int id;
        @Column(name = "id_cliente")
	private int id_cliente;
        @Column(name = "saldo")
	private String saldo;
        @Column(name = "tipo_cuenta")
	private String tipo_cuenta;
        @Column(name = "fecha_creacion")
	private Date fecha_creacion;
        @Column(name = "fecha_modificacion")
	private Date fecha_modificacion;

    public Cuentas() {
    }

    public Cuentas(int id, int id_cliente, String saldo, String tipo_cuenta, Date fecha_creacion, Date fecha_modificacion) {
        this.id = id;
        this.id_cliente = id_cliente;
        this.saldo = saldo;
        this.tipo_cuenta = tipo_cuenta;
        this.fecha_creacion = fecha_creacion;
        this.fecha_modificacion = fecha_modificacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public String getTipo_cuenta() {
        return tipo_cuenta;
    }

    public void setTipo_cuenta(String tipo_cuenta) {
        this.tipo_cuenta = tipo_cuenta;
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
