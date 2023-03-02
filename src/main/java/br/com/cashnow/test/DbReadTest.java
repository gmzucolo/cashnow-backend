package br.com.cashnow.test;

import br.com.cashnow.domain.User;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class DbReadTest {

    public static void main(String[] args) {
        EntityManager em;

        em = Persistence
                .createEntityManagerFactory("cashnow")
                .createEntityManager();

        //lê um registro do banco
        User user = em.find(User.class, "12345678910");

        System.out.println(user.getUserCpf() + " " + user.getUserName());
        em.close();
    }
}
