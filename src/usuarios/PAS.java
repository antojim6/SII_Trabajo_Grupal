/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import proyectos.Proyecto;

/**
 *
 * @author mtGómez
 */
@Entity
@DiscriminatorValue("PAS")
public class PAS extends Usuario implements Serializable {

    @Column(name = "Profesion", nullable = false, length = 50)
    private String Profesion;
    @Column(name = "Departamento", nullable = false, length = 50)
    private String departamento;
    @ManyToMany
    @JoinTable(name = "jnd_Proyecto_PAS", joinColumns = @JoinColumn(name = "Proyecto_fk"), inverseJoinColumns = @JoinColumn(name = "PAS_fk"))
    private List<Proyecto> CoordinaProyectoPAS;

    //Lista de getters 
    public String getProfesion() {
        return Profesion;
    }

    public String getDepartamento() {
        return departamento;
    }

    //Lista de setters
    public void setProfesion(String areaEstudio) {
        this.Profesion = areaEstudio;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
}
