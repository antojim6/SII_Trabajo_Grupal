/*
 * Clase Actividad:
 * Representa a las actividades dentro de cada proyecto.
 * Almacena los datos más importantes sobre las mismas.
 */
package proyectos;

import java.io.Serializable;
import usuarios.Usuario;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Francisco Jesús Perdiguero Moreno
 */
@Entity
public class Actividad implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    @Column(name = "descripcion", nullable = false, length = 50)
    private String descripcion;
    @Column(name = "conocimientos_necesarios", nullable = false, length = 50)
    private String conocimientos_necesarios;
    @Column(name = "fecha_inicio", nullable = false, length = 50)
    @Temporal(TemporalType.DATE)
    private Date fecha_inicio;
    @Column(name = "fecha_finalizacion", nullable = true, length = 50)
    @Temporal(TemporalType.DATE)
    private Date fecha_finalizacion;
    @ManyToMany(mappedBy = "actividades")
    private List<Usuario> participantes;
    @ManyToOne
    private Proyecto proyecto;

    public Long getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }
  
    public String getDescripcion() {
        return descripcion;
    }

    public String getConocimientos_necesarios() {
        return conocimientos_necesarios;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }
    
    public Date getFecha_finalizacion() {
        return fecha_finalizacion;
    }
    
    public List<Usuario> getParticipantes(){
        return participantes;
    }
    
    public Proyecto getProyecto(){
        return proyecto;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setConocimientos_necesarios(String conocimientos_necesarios) {
        this.conocimientos_necesarios = conocimientos_necesarios;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public void setFecha_finalizacion(Date fecha_finalizacion) {
        this.fecha_finalizacion = fecha_finalizacion;
    }
    
    public void setParticipantes(List<Usuario> participantes){
        this.participantes = participantes;
    }
    
    public void setProyecto(Proyecto p){
        this.proyecto = p;
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
        if (!(object instanceof Actividad)) {
            return false;
        }
        Actividad other = (Actividad) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyectos.Actividad[ id=" + id + " ]";
    }
    
}
