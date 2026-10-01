package ModelTeste;

import model.enums.Gender;
import model.enums.UserRole;

import java.sql.Date;

public class User extends Person{

    private String username;
    private String hashPassword;
    private String phoneNumber;
    private String email;
    private UserRole userRole;


    public User(Long id, String lastName, String firstName, Date birthDate, String documentId, Gender gender, String username, String hashPassword, String phoneNumber, String email, UserRole userRole) {
        super(id, lastName, firstName, birthDate, documentId, gender);
        this.username = username;
        this.hashPassword = hashPassword;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.userRole = userRole;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHashPassword() {
        return hashPassword;
    }

    public void setHashPassword(String hashPassword) {
        this.hashPassword = hashPassword;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }
}
