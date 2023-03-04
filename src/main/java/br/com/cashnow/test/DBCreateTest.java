package br.com.cashnow.test;

import br.com.cashnow.domain.Account;
import br.com.cashnow.domain.User;
import br.com.cashnow.utils.Utils;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class DBCreateTest {

    public static void main(String[] args) {

//        Utils utils = new Utils();
        User user = new User(
                "12345678911",
                "carol",
                "01123456789",
                "carolteste@fiap.com.br");

        Account account = new Account(2, user);

//        EntityManager entityManager = utils.createPersistence();
//        utils.doPersistenceTransaction(entityManager, user);

        EntityManager em = null;

        try {
            em = Persistence
                    .createEntityManagerFactory("cashnow")
                    .createEntityManager();

//            User user = new User(
//                    "12345678910",
//                    "gustavo",
//                    "01123456789",
//                    "gustavoteste@fiap.com.br"
//            );
//
//            Account account = new Account(1, user);
//            //CRIAR INSTANCIAS SEPARADAS DO EM UM PARA USER E OUTRO PARA ACCOUNT E INSTANCIAR OS DOIS OBJETOS
//            //cria um novo registro (nova entidade)
////            em.persist(user);
            em.merge(account);
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
