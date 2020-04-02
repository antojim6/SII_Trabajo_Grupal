/*
 * Clase PAS:
 * Hereda de Usuario.
 * Contiene los datos del Personal de Administración y Servicios.
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
 * @author Miguel Torres Gómez
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
        return "Persnal de Administración y Servicios: "+super.getNombre()+" "+super.getApellidos()+" Profesion: " + this.Profesion + " ID: "+super.getId();
    }
    
    
}
