package br.com.cashnow.domain;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "tb_account")
public class Account {

    public Account() {
    }

    public Account(int accountId) {
        this.accountId = accountId;
    }

    @Id
    @SequenceGenerator(name = "account", sequenceName = "sq_tb_account", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "account")
    @Column(name = "account_id")
    private int accountId;

    @OneToOne(mappedBy = "userCpf")
    private User user;

    @OneToMany(mappedBy = "accountId")
    private Collection<AccountIncome> incomes;

    @OneToMany(mappedBy = "accountId")
    private Collection<AccountExpense> expenses;

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public Collection<AccountIncome> getIncomes() {
        return incomes;
    }

    public void setIncomes(List<AccountIncome> incomes) {
        this.incomes = incomes;
    }

    public Collection<AccountExpense> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<AccountExpense> expenses) {
        this.expenses = expenses;
    }
}
