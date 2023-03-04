package br.com.cashnow.dao;

import br.com.cashnow.domain.AccountIncome;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class AccountIncomeDAO {

    @PersistenceContext
    EntityManager entityManager;

    public void create(AccountIncome income) {
        entityManager.persist(income);
    }

    public AccountIncome findById(int incomeId) {
        return entityManager.find(AccountIncome.class, incomeId);
    }

    public void update(AccountIncome income) {
        entityManager.merge(income);
    }

    public void delete(AccountIncome income) {
        entityManager.remove(income);
    }

    public List<AccountIncome> findAll() {
        return entityManager.createQuery("SELECT * FROM tb_account_income").getResultList();
    }
}
