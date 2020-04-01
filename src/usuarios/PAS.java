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

    private static final long serialVersionUID = 1L;

    @Column(name = "Area_de_Estudio", nullable = false, length = 50)
    private String Area_de_Estudio;
    @Column(name = "Departamento", nullable = false, length = 50)
    private String departamento;
    @ManyToMany
    @JoinTable(name = "jnd_Proyecto_PAS", joinColumns = @JoinColumn(name = "Proyecto_fk"), inverseJoinColumns = @JoinColumn(name = "PAS_fk"))
    private List<Proyecto> CoordinaProyectoPAS;

    //Lista de getters 
    public String getAreaEstudio() {
        return Area_de_Estudio;
    }

    public String getDepartamento() {
        return departamento;
    }

    //Lista de setters
    public void setAreaEstudio(String areaEstudio) {
        this.Area_de_Estudio = areaEstudio;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (super.getId() != null ? super.getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PAS)) {
            return false;
        }
        PAS other = (PAS) object;
        if ((super.getId() == null && other.getId() != null) || (super.getId() != null && !super.getId().equals(other.getId()))) {
            return false;
        }
        return true;
    }
    
}
