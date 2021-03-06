/*
 * Clase Proyecto:
 * Representa a los proyectos.
 * Almacena los datos de interés sobre los mismos.
 */
package proyectos;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import usuarios.ONG;
import usuarios.PAS;
import usuarios.PDI;

/**
 *
 * @author Ignacio Jiménez del Castillo
 */
@Entity
public class Proyecto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "id", nullable = false, length = 50)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    @Column(name = "descripcion", nullable = false, length = 50)
    private String descripcion;
    @Column(name = "localidad", nullable = false, length = 50)
    private String localidad;
    
    @ManyToOne
    private ONG ong; //Varios proyectos son organizados por una ONG
    @ManyToMany (mappedBy = "CoordinaProyectoPDI")
    private List<PDI> coordinatedByPDI;
    @OneToMany (mappedBy = "proyecto_ID")
    private List<ArchivoAdjunto> contieneArchivos;
    @ManyToMany (mappedBy = "CoordinaProyectoPAS")
    private List<PAS> coordinatedByPAS;
    @ManyToMany (mappedBy = "CoordinaProyectoEtiquetas")
    private List<Etiqueta> coordinatedByEtiqueta;
    @OneToMany (mappedBy="proyecto")
    private List<Actividad> actividades;
    public String getNombre() {
        return nombre;
    }
   
    public String getDescripcion() {
        return descripcion;
    }
    
    public String getLocalidad() {
        return localidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
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
        if (!(object instanceof Proyecto)) {
            return false;
        }
        Proyecto other = (Proyecto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyectos.Proyecto[ id=" + id + " ]";
    }
    
}
