package service;
import model.User;
import dao.UserDao;

import org.mindrot.jbcrypt.BCrypt;


import utils.JPAUtil;
import utils.PasswordUtil;



public class AuthService {


    private User user;
    private UserDao userDao;

    public AuthService() {
        userDao = new UserDao(JPAUtil.getEntityManagerFactory());
    }

    public void register(String username,String email, String password, String firstname, String lastname){
        String hashPassword = PasswordUtil.createHashPassword(password);

        User user = new User(null,username,email,hashPassword,firstname,lastname);
        userDao.createUser(user);

    }

    public boolean login(String username, String password){
        user = userDao.searchByUsername(username);

        if (user==null) return false;

        return BCrypt.checkpw(password, user.getPassword());
    }




}
