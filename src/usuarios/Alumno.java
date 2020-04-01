/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author pablojoel
 */
@Entity
public class Alumno extends Usuario implements Serializable {

    private final Long id = super.getId();
    private String Carrera;
    private String Area_de_interes;
    private String Disponibilidad;

    public Long getID() {
        return this.id;
    }
 
    public String getArea_de_interes() {
        return Area_de_interes;
    }

    public String getDisponibilidad() {
        return Disponibilidad;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public void setArea_de_interes(String Area_de_interes) {
        this.Area_de_interes = Area_de_interes;
    }

    public void setDisponibilidad(String Disponibilidad) {
        this.Disponibilidad = Disponibilidad;
    }
    
    @Override
    public String toString() {
        return "Alumno: "+super.getNombre()+" "+super.getApellidos()+" ID: "+this.id;
    }
    
}
