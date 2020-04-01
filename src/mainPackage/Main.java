package mainPackage;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Trabajo_GrupalPU");
        EntityManager em = emf.createEntityManager();
//        
//        Etiqueta e = new Etiqueta();
//        EntityTransaction tx = em.getTransaction();
//        tx.begin();
//        em.persist(e);
//        tx.commit();
//        
        em.close();
        emf.close();
    }
    
}
