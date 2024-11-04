package teste.basico;

import models.basic.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario1 {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("secao16JPA");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Usuario usuario = em.find(Usuario.class, 1L);
        usuario.setNome("Rafinha");
        usuario.setEmail("rafinha@gmail.com");
        em.merge(usuario);
        System.out.println(usuario.getNome());

        em.getTransaction().commit();

        emf.close();
        em.close();

    }

}
