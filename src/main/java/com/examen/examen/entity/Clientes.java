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
@Table(name="Clientes")
public class Clientes implements Serializable {
    
        @Id
	@Column(name = "id")
	private int id;
        @Column(name = "nombre")
	private String nombre;
        @Column(name = "apellidoPaterno")
	private String apellidoPaterno;
        @Column(name = "apellidoMaterno")
	private String apellidoMaterno;
        @Column(name = "correo")
	private String correo;
        @Column(name = "fecha_nacimiento")
	private Date fecha_nacimiento;
        @Column(name = "sexo")
	private String sexo;
        @Column(name = "telefono")
	private String telefono;
        @Column(name = "fecha_creacion")
	private Date fecha_creacion;
        @Column(name = "fecha_modificacion")
	private Date fecha_modificacion;

    public Clientes() {
    }
   
        
    public Clientes(int id, String nombre, String apellidoPaterno, String apellidoMaterno, String correo, Date fecha_nacimiento, String sexo, String telefono, Date fecha_creacion, Date fecha_modificacion) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.correo = correo;
        this.fecha_nacimiento = fecha_nacimiento;
        this.sexo = sexo;
        this.telefono = telefono;
        this.fecha_creacion = fecha_creacion;
        this.fecha_modificacion = fecha_modificacion;
    }
        
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
