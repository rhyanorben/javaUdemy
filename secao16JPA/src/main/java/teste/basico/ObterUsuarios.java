package teste.basico;

import models.basic.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class ObterUsuarios {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("secao16JPA");
        EntityManager em = emf.createEntityManager();

//        String jpql = "select u from Usuario u";
//        TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
//        query.setMaxResults(5);

        List<Usuario> usuarios = em.createQuery("select u from Usuario u", Usuario.class).setMaxResults(5).getResultList();

        for (Usuario usuario : usuarios) {
            System.out.println(usuario.getId() + "|" + usuario.getNome());
        }


        emf.close();
        em.close();
    }

}
