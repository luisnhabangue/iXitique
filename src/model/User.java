package model;

import jakarta.persistence.*;
import model.enums.UserRole;

import java.math.BigDecimal;


@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(unique = true)
    private String email;
    @Column(name = "password_hash", nullable = false)
    private String password;
    @Column(nullable = false)
    private boolean active;

    private String  firstName;
    private String lastName;

    @Enumerated(EnumType.STRING)
    private UserRole role;


    public User(Integer id, String username, String email, String password, String firstName, String lastName) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.active = true;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = UserRole.base;
    }

    public User() {

    }


    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public User(Object o, String username, String email, String hash, String firstname, String lastname) {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
