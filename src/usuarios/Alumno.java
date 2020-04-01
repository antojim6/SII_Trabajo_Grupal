/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author pablojoel
 */
@Entity
@DiscriminatorValue("ALUMNO")
public class Alumno extends Usuario implements Serializable {
    
    private String Carrera;
    private String Area_de_interes;
    private String Disponibilidad;

    @Column(name = "Carrera", nullable = false, length = 150)
    public String getCarrera(){
        return Carrera;
    }
    
    @Column(name = "Area_de_interes", nullable = false, length = 100)
    public String getArea_de_interes() {
        return Area_de_interes;
    }

    @Column(name = "Disponibilidad", nullable = false, length = 150)
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
        return "Alumno: "+super.getNombre()+" "+super.getApellidos()+" ID: "+super.getId();
    }
    
}
