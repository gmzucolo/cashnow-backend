package br.com.cashnow.test;

import javax.persistence.Persistence;

public class DBTest {

    public static void main(String[] args) {
        Persistence.createEntityManagerFactory("cashnow").createEntityManager();
    }
}
