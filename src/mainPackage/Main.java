package mainPackage;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        // Código a ejecutar para la generación de las tablas en la BBDD.
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Trabajo_GrupalPU");
        EntityManager em = emf.createEntityManager();
        
        em.close();
        emf.close();
    }
    
}
