package br.com.cashnow.test;

import br.com.cashnow.domain.Account;
import br.com.cashnow.domain.User;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class DBAccountCreateTest {

    public static void main(String[] args) {
        EntityManager em = null;
        try {
            em = Persistence
                    .createEntityManagerFactory("cashnow")
                    .createEntityManager();
            Account account = new Account();
            //cria um novo registro (nova entidade)
            em.persist(account);
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
