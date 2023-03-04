package br.com.cashnow.utils;

import br.com.cashnow.dao.AccountDAO;
import br.com.cashnow.dao.UserDAO;
import br.com.cashnow.domain.Account;
import br.com.cashnow.domain.User;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public final class Utils {

    static String PERSISTENCE_NAME = "cashnow";

    public EntityManager createPersistence() {
        return Persistence
                .createEntityManagerFactory(PERSISTENCE_NAME)
                .createEntityManager();
    }

    public void doUserCreateTransaction(EntityManager entityManager, User user) {
        UserDAO userDAO = new UserDAO();
        try {
            userDAO.create(entityManager, user);
            entityManager.getTransaction().begin();
            entityManager.getTransaction().commit();

        } catch (Exception e) {
            if (entityManager != null && entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
            System.exit(0);
        }
    }

    public void doUserUpdateTransaction(EntityManager entityManager, User user) {
        UserDAO userDAO = new UserDAO();
        try {
            userDAO.update(entityManager, user);
            entityManager.getTransaction().begin();
            entityManager.getTransaction().commit();

        } catch (Exception e) {
            if (entityManager != null && entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
            System.exit(0);
        }
    }

    public void doUserFindByIdTransaction(EntityManager entityManager, String userCpf) {
        UserDAO userDAO = new UserDAO();
        try {
            userDAO.findById(entityManager, userCpf);
            entityManager.getTransaction().begin();
            entityManager.getTransaction().commit();

        } catch (Exception e) {
            if (entityManager != null && entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
            System.exit(0);
        }
    }

    public void doUserDeleteTransaction(EntityManager entityManager, User user) {
        UserDAO userDAO = new UserDAO();
        try {
            User userRecovery = entityManager.find(User.class, user.getUserCpf());
            userDAO.delete(entityManager, userRecovery);
            entityManager.getTransaction().begin();
            entityManager.getTransaction().commit();

        } catch (Exception e) {
            if (entityManager != null && entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
            System.exit(0);
        }
    }

    public void doAccountCreateTransaction(EntityManager entityManager, Account account) {
        AccountDAO accountDAO = new AccountDAO();
        try {
            accountDAO.create(entityManager, account);
            entityManager.getTransaction().begin();
            entityManager.getTransaction().commit();

        } catch (Exception e) {
            if (entityManager != null && entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
            System.exit(0);
        }
    }

    public void doAccountUpdateTransaction(EntityManager entityManager, Account account) {
        AccountDAO accountDAO = new AccountDAO();
        try {
            accountDAO.update(entityManager, account);
            entityManager.getTransaction().begin();
            entityManager.getTransaction().commit();

        } catch (Exception e) {
            if (entityManager != null && entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
            System.exit(0);
        }
    }

    public void doAccountFindByIdTransaction(EntityManager entityManager, int accountId) {
        AccountDAO accountDAO = new AccountDAO();
        try {
            accountDAO.findById(entityManager, accountId);
            entityManager.getTransaction().begin();
            entityManager.getTransaction().commit();

        } catch (Exception e) {
            if (entityManager != null && entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
            System.exit(0);
        }
    }

    public void doAccountDeleteTransaction(EntityManager entityManager, Account account) {
        AccountDAO accountDAO = new AccountDAO();
        try {
            accountDAO.delete(entityManager, account);
            entityManager.getTransaction().begin();
            entityManager.getTransaction().commit();

        } catch (Exception e) {
            if (entityManager != null && entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
            System.exit(0);
        }
    }

}
