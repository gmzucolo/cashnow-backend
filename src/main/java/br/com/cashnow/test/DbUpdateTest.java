package br.com.cashnow.test;

import br.com.cashnow.domain.User;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class DbUpdateTest {

    public static void main(String[] args) {
        EntityManager em;

        em = Persistence
                .createEntityManagerFactory("cashnow")
                .createEntityManager();

        User user = em.find(User.class, "12345678910");

        //atualiza um registro já existente
        user.setUserName("carol");

        em.getTransaction().begin();
        em.getTransaction().commit();

        System.out.println(user.getUserCpf() + " " + user.getUserName());
        em.close();
    }
}
