package br.com.cashnow.dao;

import br.com.cashnow.domain.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;


@Transactional
public class UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public void create(User user) {
        entityManager.persist(user);
    }

    public User findById(String userCpf) {
        return entityManager.find(User.class, userCpf);
    }

    public void update(User user) {
        entityManager.merge(user);
    }

    public void delete(User user) {
        entityManager.remove(user);
    }

    public List<User> findAll() {
        return entityManager.createQuery("SELECT * FROM tb_user").getResultList();
    }

}
