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
 * @author Pablo Andrés Domínguez
 */
@Entity
@DiscriminatorValue("PDI")
public class PDI extends Usuario implements Serializable {

    @Column(name = "Area_de_Estudio", nullable = false, length = 50)
    private String Area_de_Estudio;
    @Column(name = "Departamento", nullable = false, length = 50)
    private String Departamento;
    
@ManyToMany
@JoinTable(name = "jnd_Proyecto_PDI", joinColumns = @JoinColumn(name = "Proyecto_fk"), inverseJoinColumns = @JoinColumn(name = "PDI_fk"))
    private List<Proyecto> CoordinaProyectoPDI;
    
    public String getAreaDeEstudio() {
        return Area_de_Estudio;
    }

    public void setAreaDeEstudio(String Area_de_Estudio) {
        this.Area_de_Estudio = Area_de_Estudio;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
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
        if (!(object instanceof PDI)) {
            return false;
        }
        PDI other = (PDI) object;
        if ((super.getId() == null && other.getId() != null) || (super.getId() != null && !super.getId().equals(other.getId()))) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "Personal Docente e Investigador: "+super.getNombre()+" "+super.getApellidos()+" Departamento: " + this.Departamento + " ID: "+super.getId();
    }
    
}
