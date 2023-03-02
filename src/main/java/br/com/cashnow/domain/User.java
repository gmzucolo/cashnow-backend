package br.com.cashnow.domain;

import javax.persistence.*;

@Entity
@Table(name = "tb_user")
public class User {

    public User() {
    }

    public User(String userCpf, String userName) {
        this.userCpf = userCpf;
        this.userName = userName;
    }

    public User(String userCpf, String userName, String userPhone, String userEmail) {
        this.userCpf = userCpf;
        this.userName = userName;
        this.userPhone = userPhone;
        this.userEmail = userEmail;
    }

    @Id
    @Column(name = "user_cpf")
    private String userCpf;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_phone")
    private String userPhone;

    @Column(name = "user_email")
    private String userEmail;

    public String getUserCpf() {
        return userCpf;
    }

    public void setUserCpf(String userCpf) {
        this.userCpf = userCpf;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
