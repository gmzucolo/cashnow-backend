package br.com.cashnow.domain;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "tb_account_income")
public class AccountIncome {

    public AccountIncome() {
    }

    public AccountIncome(int accIncomeId, Double accIncomeVl, String accIncomeDs, Calendar accIncomeDt) {
        this.accIncomeId = accIncomeId;
        this.accIncomeVl = accIncomeVl;
        this.accIncomeDs = accIncomeDs;
        this.accIncomeDt = accIncomeDt;
    }

    @Id
    @SequenceGenerator(name = "acc_income", sequenceName = "sq_tb_account_income", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "acc_income")
    @Column(name = "acc_income_id")
    private int accIncomeId;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account accountId;

    @Column(name = "acc_income_vl")
    private Double accIncomeVl;

    @Column(name = "acc_income_ds")
    private String accIncomeDs;

    @CreationTimestamp
    @Column(name = "acc_income_dt")
    @Temporal(TemporalType.DATE)
    private Calendar accIncomeDt;

    public int getAccIncomeId() {
        return accIncomeId;
    }

    public void setAccIncomeId(int accIncomeId) {
        this.accIncomeId = accIncomeId;
    }

    public Double getAccIncomeVl() {
        return accIncomeVl;
    }

    public void setAccIncomeVl(Double accIncomeVl) {
        this.accIncomeVl = accIncomeVl;
    }

    public String getAccIncomeDs() {
        return accIncomeDs;
    }

    public void setAccIncomeDs(String accIncomeDs) {
        this.accIncomeDs = accIncomeDs;
    }

    public Calendar getAccIncomeDt() {
        return accIncomeDt;
    }

    public void setAccIncomeDt(Calendar accIncomeDt) {
        this.accIncomeDt = accIncomeDt;
    }
}
