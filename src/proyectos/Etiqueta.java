/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Pablo Andrés Domínguez
 */
@Entity
public class Etiqueta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String tag;
    @Column(name = "Categoria", nullable = false, length = 50)
    private String Categoria;

    public String getId() {
        return tag;
    }

    public void setId(String tag) {
        this.tag = tag;
    }
    
    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etiqueta)) {
            return false;
        }
        Etiqueta other = (Etiqueta) object;
        if ((this.tag == null && other.tag != null) || (this.tag != null && !this.tag.equals(other.tag))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.tag);
        hash = 59 * hash + Objects.hashCode(this.Categoria);
        return hash;
    }

    @Override
    public String toString() {
        return "Etiqueta[ Tag=" + tag + " ]";
    }
    
}
