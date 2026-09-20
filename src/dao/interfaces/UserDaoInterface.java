package dao.interfaces;

import model.User;

import java.util.List;

public interface UserDaoInterface {

    public void createUser(User user);
    public User findById(Integer id);
    public void updateUser(User user);
    public void disableUser(Integer id);
    public void deleteUser(Integer id);
    public List<User> listAllUsers();

}
