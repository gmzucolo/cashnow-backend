package br.com.cashnow.dao;

import br.com.cashnow.domain.AccountExpense;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class AccountExpenseDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public void create(AccountExpense expense) {
        entityManager.persist(expense);
    }

    public AccountExpense findById(int expenseId) {
        return entityManager.find(AccountExpense.class, expenseId);
    }

    public void update(AccountExpense expense) {
        entityManager.merge(expense);
    }

    public void delete(AccountExpense expense) {
        entityManager.remove(expense);
    }

    public List<AccountExpense> findAll() {
        return entityManager.createQuery("SELECT * FROM tb_acc_expense").getResultList();
    }
}
