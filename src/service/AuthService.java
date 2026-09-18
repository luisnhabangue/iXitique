package service;
import model.User;
import dao.UserDao;
import org.mindrot.jbcrypt.BCrypt;

import jakarta.persistence.EntityManagerFactory;

import javax.persistence.Persistence;


public class AuthService {
    private static EntityManagerFactory entityManagerFactory = (EntityManagerFactory) Persistence.createEntityManagerFactory("iXitique");


    private User user;
    private UserDao userDao;
    public AuthService() {
        userDao = new UserDao(entityManagerFactory);
    }

    public void createUser(String username, String password,String firstname, String lastname){
        String hash = BCrypt.hashpw(
                password,
                BCrypt.gensalt(12)
        );

        User user = new User(null,username,hash,firstname,lastname);
        userDao.saveUser(user);

    }

    public boolean login(String username, String password){

        user = userDao.searchByUsername(username);
        if (user==null) return false;
        return BCrypt.checkpw(password, user.getPassword());
    }


    /*


*/

}
