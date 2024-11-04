package teste.basico;

import models.basic.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RemoverUsuario {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("secao16JPA");
        EntityManager em = emf.createEntityManager();

        Usuario usuario = em.find(Usuario.class, 1L);

        em.getTransaction().begin();
        if (usuario != null) {
            em.remove(usuario);
        }
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
