/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos;
import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author a_tm1
 */
public class ArchivoAdjunto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String extension;
    private String nombre;
    private String fecha_subida;
    private String comentario;
          
    
    
    public Long getId() {
        return id;
    }
    public String getExtension() {
       return extension;
    }
    public String getNombre() {
        return nombre;
    }
    public String getFecha_subida() {
        return fecha_subida;
    }  
    public String getComentario() {
        return comentario;
    }
    
    public void setId(Long id){
        this.id = id;
    }
    public void setExtension(String extension){
        this.extension = extension;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setFecha_subida(String fecha){
        this.fecha_subida = fecha;
    }
    public void setComentario(String comentario){
        this.comentario = comentario;
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
        if (!(object instanceof ArchivoAdjunto)) {
            return false;
        }
        ArchivoAdjunto other = (ArchivoAdjunto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    
     @Override
    public String toString() {
        return "Archivo Adjunto[ id=" + id + " ]";
    }
}
