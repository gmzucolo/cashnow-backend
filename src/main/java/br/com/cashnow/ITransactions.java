package br.com.cashnow;

import br.com.cashnow.dao.UserDAO;
import br.com.cashnow.domain.User;

public interface ITransactions {
    public void create(UserDAO userDAO, User user);
}
