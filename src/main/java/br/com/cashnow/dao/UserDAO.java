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

    public void create(EntityManager entityManager, User user) {
        entityManager.persist(user);
    }

    public User findById(EntityManager entityManager, String userCpf) {
        return entityManager.find(User.class, userCpf);
    }

    public void update(EntityManager entityManager, User user) {
        entityManager.merge(user);
    }

    public void delete(EntityManager entityManager, User user) {
        entityManager.remove(user);
    }

    public List<User> findAll() {
        return entityManager.createQuery("SELECT * FROM tb_user").getResultList();
    }

}
