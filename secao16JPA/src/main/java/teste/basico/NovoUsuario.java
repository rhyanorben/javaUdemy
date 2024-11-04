package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import models.basic.Usuario;

public class NovoUsuario {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("secao16JPA");
        EntityManager em = emf.createEntityManager();

        Usuario usuario = new Usuario("Rhyan Orben", "rhyan@gmail.com");
        em.getTransaction().begin();
        em.persist(usuario);
        em.getTransaction().commit();

        System.out.println("O ID gerado foi: " + usuario.getId());

        em.close();
        emf.close();

    }

}
