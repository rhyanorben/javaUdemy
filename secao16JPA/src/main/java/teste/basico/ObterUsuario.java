package teste.basico;

import models.basic.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ObterUsuario {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("secao16JPA");
        EntityManager em = emf.createEntityManager();

        Usuario usuario = em.find(Usuario.class, 3L);
        System.out.println(usuario.getNome());

        emf.close();
        em.close();
    }

}
