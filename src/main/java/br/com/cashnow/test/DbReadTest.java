package br.com.cashnow.test;

import br.com.cashnow.domain.Account;
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
        Account account = em.find(Account.class, 1);

        System.out.println(account);
        em.close();
    }
}
