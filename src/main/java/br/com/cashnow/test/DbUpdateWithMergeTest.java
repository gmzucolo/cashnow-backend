package br.com.cashnow.test;

import br.com.cashnow.domain.User;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class DbUpdateWithMergeTest {

    public static void main(String[] args) {
        EntityManager em;

        em = Persistence
                .createEntityManagerFactory("cashnow")
                .createEntityManager();

        User user = new User("12345678910", "carol");

        //faz um update de um registro já existente no banco de dados
        em.merge(user);
        em.getTransaction().begin();
        em.getTransaction().commit();

        System.out.println(user.getUserCpf() + " " + user.getUserName());
        em.close();
    }
}
