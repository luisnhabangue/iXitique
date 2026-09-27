package dao;

import dao.interfaces.UserDaoInterface;
import exceptions.UserNotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import model.User;

import java.util.List;

public class UserDao implements UserDaoInterface {

    private final EntityManagerFactory entityManagerFactory;

    public UserDao(EntityManagerFactory entityManagerFactory) {

        this.entityManagerFactory = entityManagerFactory;

    }

    @Override
    public void createUser(User user) {
        EntityManager em = entityManagerFactory.createEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(user);
            em.getTransaction().commit();

        } catch (Exception e) {
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
            throw e;

        } finally {
            em.close();
        }
    }

    @Override
    public User findById(Integer id) {
        EntityManager em = entityManagerFactory.createEntityManager();

        try {
            return em.find(User.class, id);
        } finally {
            em.close();
        }

    }

    @Override
    public User findByUsername(String username) {

        EntityManager em = entityManagerFactory.createEntityManager();

        try {
            return em.createQuery(
                    "SELECT u FROM User u WHERE u.username = :username",
                    User.class
            ).setParameter("username", username).getSingleResult();

        } finally {
            em.close();
        }
    }

   public User findByEmail(String email) {

        EntityManager em = entityManagerFactory.createEntityManager();

        try {
            return em.createQuery(
                    "SELECT u FROM User u WHERE u.email = :email",
                    User.class
            ).setParameter("email", email).getSingleResult();

        } finally {
            em.close();
        }
    }

    public User findByPhone(String email) {

        EntityManager em = entityManagerFactory.createEntityManager();

        try {
            return em.createQuery(
                    "SELECT u FROM User u WHERE u.email = :email",
                    User.class
            ).setParameter("email", email).getSingleResult();

        } finally {
            em.close();
        }
    }

    @Override
    public void updateUser(User user) {
        EntityManager em = entityManagerFactory.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {

            et.begin();
            em.merge(user);
            et.commit();

        } catch (Exception e) {
            if (et.isActive()) {
                et.rollback();
            }
            throw e;

        } finally {
            em.close();
        }

    }

    public void deleteUser(Integer id) {
        EntityManager em = entityManagerFactory.createEntityManager();
        EntityTransaction et = em.getTransaction();


        try {
            et.begin();
            User user = em.find(User.class, id);
            ;
            if (user == null) throw new UserNotFoundException("Usuário não encontrado!");


            em.remove(user);

            et.commit();


        } catch (Exception e) {
            if (et.isActive()) {
                et.rollback();
            }
            throw e;
        } finally {
            em.close();
        }

    }


    @Override
    public void disableUser(Integer id) {
        EntityManager em = entityManagerFactory.createEntityManager();
        EntityTransaction et = em.getTransaction();


        try {
            et.begin();
            User user = em.find(User.class, id);
            if (user == null) throw new UserNotFoundException("Usuário não encontrado!");
            user.setActive(false);
            et.commit();

        } catch (Exception e) {
            if (et.isActive()) {
                et.rollback();
            }
            throw e;
        } finally {
            em.close();
        }

    }

    public List<User> listAllUsers() {

        return null;
    }


}




