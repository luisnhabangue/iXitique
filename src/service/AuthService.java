package service;
import model.User;
import dao.UserDao;
import net.bytebuddy.implementation.bytecode.Remainder;
import org.hibernate.tool.schema.internal.DefaultSchemaFilter;
import org.mindrot.jbcrypt.BCrypt;

import jakarta.persistence.EntityManagerFactory;
import utils.JPAUtil;

import javax.persistence.Persistence;


public class AuthService {


    private User user;
    private UserDao userDao;

    public AuthService() {
        userDao = new UserDao(JPAUtil.getEntityManagerFactory());
    }

    public void register(String username,String email, String password, String firstname, String lastname){
        String hashPassword = BCrypt.hashpw(
                password,
                BCrypt.gensalt(12)
        );

        User user = new User(null,username,email,hashPassword,firstname,lastname);
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
