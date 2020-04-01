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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import proyectos.Proyecto;

/**
 *
 * @author mtGómez
 */
@Entity
@DiscriminatorValue("PAS")
@Table(name = "PAS")
public class PAS extends Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "Area de Estudio", nullable = false, length = 50)
    private String areaEstudio;
    @Column(name = "Departamento", nullable = false, length = 50)
    private String departamento;
    @ManyToMany
    @JoinTable(name = "jnd_Proyecto_PAS", joinColumns = @JoinColumn(name = "Proyecto_fk"), inverseJoinColumns = @JoinColumn(name = "PAS_fk"))
    private List<Proyecto> CoordinaProyectoPAS;

    //Lista de getters
     public Long getId() {
        return id;
    }
    
    public String getAreaEstudio() {
        return areaEstudio;
    }

    public String getDepartamento() {
        return departamento;
    }

    //Lista de setters
    public void setAreaEstudio(String areaEstudio) {
        this.areaEstudio = areaEstudio;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
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
        if (!(object instanceof PAS)) {
            return false;
        }
        PAS other = (PAS) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    
}
