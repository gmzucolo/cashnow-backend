package br.com.cashnow.domain;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "tb_account_expense")
public class AccountExpense {

    public AccountExpense() {
    }

    public AccountExpense(int accExpenseId, Double accExpenseVl, String accExpenseDs, Calendar accExpenseDt) {
        this.accExpenseId = accExpenseId;
        this.accExpenseVl = accExpenseVl;
        this.accExpenseDs = accExpenseDs;
        this.accExpenseDt = accExpenseDt;
    }

    @Id
    @SequenceGenerator(name = "acc_expense", sequenceName = "sq_tb_account_expense", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "acc_expense")
    @Column(name = "acc_expense_id")
    private int accExpenseId;

    @Column(name = "acc_expense_vl")
    private Double accExpenseVl;

    @Column(name = "acc_expense_ds")
    private String accExpenseDs;

    @CreationTimestamp
    @Column(name = "acc_expense_dt")
    @Temporal(TemporalType.DATE)
    private Calendar accExpenseDt;

    public int getAccExpenseId() {
        return accExpenseId;
    }

    public void setAccExpenseId(int accExpenseId) {
        this.accExpenseId = accExpenseId;
    }

    public Double getAccExpenseVl() {
        return accExpenseVl;
    }

    public void setAccExpenseVl(Double accExpenseVl) {
        this.accExpenseVl = accExpenseVl;
    }

    public String getAccExpenseDs() {
        return accExpenseDs;
    }

    public void setAccExpenseDs(String accExpenseDs) {
        this.accExpenseDs = accExpenseDs;
    }

    public Calendar getAccExpenseDt() {
        return accExpenseDt;
    }

    public void setAccExpenseDt(Calendar accExpenseDt) {
        this.accExpenseDt = accExpenseDt;
    }
}
