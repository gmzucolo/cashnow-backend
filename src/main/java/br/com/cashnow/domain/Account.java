package br.com.cashnow.domain;

import javax.persistence.*;

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

    @JoinColumn(name = "acc_income_id")
    @ManyToOne
    private int accIncomeId;

    @JoinColumn(name = "acc_expense_id")
    @ManyToOne
    private int accExpenseId;

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
}
