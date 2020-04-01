/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Miguel Torres Gómez
 */
@Entity
public class ONG implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombreOng;
    private String nTelefono;
    private String direccion;
    private String correo;
    private int hashPassword;
    private String orientacion; //Objetivo de la ONG

    public void setNombreOng(String nombreOng) {
        this.nombreOng = nombreOng;
    }

    public void setnTelefono(String nTelefono) {
        this.nTelefono = nTelefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setHashPassword(int hashPassword) {
        this.hashPassword = hashPassword;
    }

    public void setOrientacion(String orientacion) {
        this.orientacion = orientacion;
    }
    @Column(name = "nombreONG",nullable = false,length = 50)
    public String getNombreOng() {
        return nombreOng;
    }
    @Column(name = "Numero Telefono",nullable = false,length = 9)
    public String getnTelefono() {
        return nTelefono;
    }
    @Column(name = "Direccion",nullable = false,length = 50)
    public String getDireccion() {
        return direccion;
    }
    @Column(name = "Correo",nullable = false,length = 50)
    public String getCorreo() {
        return correo;
    }
    @Column(name = "HashPassword",nullable = false,length = 50)
    public int getHashPassword() {
        return hashPassword;
    }
    @Column(name = "Orientacion",nullable = false,length = 50)
    public String getOrientacion() {
        return orientacion;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ONG)) {
            return false;
        }
        ONG other = (ONG) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    
}
