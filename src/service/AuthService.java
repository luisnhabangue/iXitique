package service;
import exceptions.*;
import model.User;
import dao.UserDao;

import org.mindrot.jbcrypt.BCrypt;


import utils.JPAUtil;
import utils.PasswordUtil;
import utils.PhoneNumberPrefix;


public class AuthService {


    private User user;
    private UserDao userDao;

    public AuthService() {
        userDao = new UserDao(JPAUtil.getEntityManagerFactory());
    }

    public void register(String username,String email, String password,String phoneNumber, String firstname, String lastname){


        if (thisUsernameExists(username)) throw new UserAlreadyExistsException("Nome de usuário inválido");

        if (thisEmailExists(email)) throw new UserAlreadyExistsException("Email inválido");

        if (thisPhoneNumberExists(phoneNumber)) throw new UserAlreadyExistsException("Numero inválido");


        if (!username.matches("[0-9a-z_.-]{3,20}")) throw new InvalidUsernameException("O nome de usuário deve ter entre 3 e 20 caracteres e conter apenas letras minúsculas, números, '.', '-' ou '_'");
        if (!email.isEmpty()) {
            if (!email.matches("[a-z0-9_.-]+@[a-z0-9.-]+\\.[a-z]{2,}"))
                throw new InvalidEmailException("E-mail inválido. Use apenas letras minúsculas, números e caracteres permitidos.");
        }
        if (!phoneNumber.isEmpty()) {
            phoneNumber = phoneNumber.replaceAll("\\s+", "");

            if (!phoneNumber.matches("^(\\+258)?(82|83|84|85|86|87)[0-9]{7}$")) throw new InvalidPhoneNumberException("Numero de telefone invalido");

        }

        String hashPassword = PasswordUtil.createHashPassword(password);

       // userDao.createUser(user);

    }
    public User login(String identifier, String password){
        user = userDao.findByUsername(identifier);
        user = userDao.findByPhone(identifier);
        user = userDao.findByEmail(identifier);

        if (!BCrypt.checkpw(password, user.getPassword())){
            throw new UserNotFoundException("Usuário ou senha inválidos!");

        }
        return user;
    }

    public boolean thisUsernameExists(String username){
        this.user = userDao.findByUsername(username);
        if (this.user!=null) return true;

        return false;
    }
    public boolean thisEmailExists(String email){
        this.user = userDao.findByEmail(email);
        if (this.user != null) return true;

        return false;
    }
    public boolean thisPhoneNumberExists(String number){
        this.user = userDao.findByPhone(number);
        if (this.user != null) return true;

        return false;
    }


}
