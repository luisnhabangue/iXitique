package dao.interfaces;

import model.User;

import java.nio.file.LinkOption;
import java.util.List;

public interface UserDaoInterface {

    public void createUser(User user);
    public User findById(Long id);
    public User findByUsername(String username);
    public User findByEmail(String email);
    public void updateUser(User user);
    public void disableUser(Long id);
    public void deleteUser(Long id);
    public List<User> listAllUsers();

}
