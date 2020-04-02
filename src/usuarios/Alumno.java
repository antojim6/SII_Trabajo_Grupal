/*
 * Clase Alumno:
 * Hereda de Usuario.
 * Contiene los datos de los estudiantes voluntarios.
 */
package usuarios;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author Pablo Joel Núñez Campos
 */
@Entity
@DiscriminatorValue("ALUMNO")
public class Alumno extends Usuario implements Serializable {
    
    @Column(name = "Carrera", nullable = false, length = 150)
    private String Carrera;
    
    @Column(name = "Area_de_interes", nullable = true, length = 100)
    private String Area_de_interes;
    
    @Column(name = "Disponibilidad", nullable = true, length = 150)
    private String Disponibilidad;

    
    public String getCarrera(){
        return Carrera;
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
        return "Alumno: "+super.getNombre()+" "+super.getApellidos()+" ID: "+super.getId();
    }
    
}
