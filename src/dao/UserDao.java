package dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import model.User;

import java.util.List;

public class UserDao {

    private EntityManagerFactory entityManagerFactory;


    public UserDao(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    public void createUser(User user){
        EntityManager em = entityManagerFactory.createEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(user);
            em.getTransaction().commit();

        } catch (Exception e){
            if (em.getTransaction().isActive())  em.getTransaction().rollback();

            e.printStackTrace();

        }finally {
            em.close();
        }
    }

    public User searchByUsername(String username) {

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
    public void updateUser(User User){


    }

    public boolean deleteUser(){

        return false;

    }
    public List<User> listAllUsers(){

        return null;
    }


}




