package br.com.cashnow.test;

import br.com.cashnow.domain.Account;
import br.com.cashnow.domain.User;
import br.com.cashnow.utils.Utils;

import javax.persistence.EntityManager;

public class DBAccountUpdateTest {

    public static void main(String[] args) {

        Utils utils = new Utils();
        Account account = new Account(5, new User("12345678913"));

        //CREATE
//        EntityManager entityManager = utils.createPersistence();
//        utils.doAccountUpdateTransaction(entityManager, account);

        //FIND
//        EntityManager entityManager = utils.createPersistence();
//        utils.doAccountFindByIdTransaction(entityManager, 4);

        // UPDATE
//        EntityManager entityManager = utils.createPersistence();
//        utils.doAccountUpdateTransaction(entityManager, account);

        //REMOVE
//        EntityManager entityManager = utils.createPersistence();
//        utils.doAccountDeleteTransaction(entityManager, account);
    }
}
