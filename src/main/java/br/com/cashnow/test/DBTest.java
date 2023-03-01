package br.com.cashnow.test;

import br.com.cashnow.domain.User;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class DBTest {

    public static void main(String[] args) {
        EntityManager em = null;
        try {
            em = Persistence
                    .createEntityManagerFactory("cashnow")
                    .createEntityManager();
            User user = new User(
                    "12345678910",
                    "gustavo",
                    "01123456789",
                    "gustavoteste@fiap.com.br"
            );
            em.merge(user);
            em.getTransaction().begin();
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em != null && em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        } finally {
            if (em != null) {
                em.close();
            }
            System.exit(0);
        }
    }
}
