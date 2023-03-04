package br.com.cashnow.domain;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "tb_account_expense")
public class AccountExpense {

    public AccountExpense() {
    }

    public AccountExpense(int expenseId, Double ExpenseVl, String expenseDs, Calendar expenseDt) {
        this.expenseId = expenseId;
        this.expenseVl = ExpenseVl;
        this.expenseDs = expenseDs;
        this.expenseDt = expenseDt;
    }

    @Id
    @SequenceGenerator(name = "acc_expense", sequenceName = "sq_tb_account_expense", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "acc_expense")
    @Column(name = "acc_expense_id")
    private int expenseId;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account accountId;

    @Column(name = "acc_expense_vl")
    private Double expenseVl;

    @Column(name = "acc_expense_ds")
    private String expenseDs;

    @CreationTimestamp
    @Column(name = "acc_expense_dt")
    @Temporal(TemporalType.DATE)
    private Calendar expenseDt;

    public int getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(int expenseId) {
        this.expenseId = expenseId;
    }

    public Double getExpenseVl() {
        return expenseVl;
    }

    public void setExpenseVl(Double expenseVl) {
        this.expenseVl = expenseVl;
    }

    public String getExpenseDs() {
        return expenseDs;
    }

    public void setExpenseDs(String expenseDs) {
        this.expenseDs = expenseDs;
    }

    public Calendar getExpenseDt() {
        return expenseDt;
    }

    public void setExpenseDt(Calendar expenseDt) {
        this.expenseDt = expenseDt;
    }
}
