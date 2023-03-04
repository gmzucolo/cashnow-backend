package br.com.cashnow.dao;

import br.com.cashnow.domain.Account;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class AccountDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public void create(Account account) {
        entityManager.persist(account);
    }

    public Account findById(int accountId) {
        return entityManager.find(Account.class, accountId);
    }

    public void update(Account account) {
        entityManager.merge(account);
    }

    public void delete(Account account) {
        entityManager.remove(account);
    }

    public List<Account> findAll() {
        return entityManager.createQuery("SELECT * FROM tb_account").getResultList();
    }
}
