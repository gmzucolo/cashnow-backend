package br.com.cashnow.domain;

import javax.persistence.*;

@Entity
@Table(name = "tb_account")
public class Account {

    public Account() {
    }

    public Account(int accountId, User user) {
        this.accountId = accountId;
        this.user = user;
    }

    @Id
    @SequenceGenerator(name = "account", sequenceName = "sq_tb_account", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "account")
    @Column(name = "account_id")
    private int accountId;

    @OneToOne
    @JoinColumn(name = "user_cpf")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

}
