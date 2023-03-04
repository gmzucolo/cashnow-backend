package br.com.cashnow.test;

import br.com.cashnow.domain.User;
import br.com.cashnow.utils.Utils;

import javax.persistence.EntityManager;

public class DBUserCreateTest {

    public static void main(String[] args) {

        Utils utils = new Utils();
        User user = new User(
                "12345678913",
                "sonia",
                "01123456789",
                "soniateste@fiap.com.br");

        //CREATE
        EntityManager entityManager = utils.createPersistence();
        utils.doUserCreateTransaction(entityManager, user);

        //FIND
//        EntityManager entityManager = utils.createPersistence();
//        utils.doUserFindByIdTransaction(entityManager, "12345678912");
//
        // UPDATE
//        EntityManager entityManager = utils.createPersistence();
//        utils.doUserUpdateTransaction(entityManager, user);

        //REMOVE
//        EntityManager entityManager = utils.createPersistence();
//        utils.doUserDeleteTransaction(entityManager, user);
    }
}