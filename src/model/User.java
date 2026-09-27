package model;

import jakarta.persistence.*;
import model.enums.UserRole;

import java.sql.Date;


@Entity
@Table(name = "users")
public class User extends Person {

    @Column(nullable = false, unique = true)
    private String username;

    @Column(unique = true)
    private String email;
    @Column(name = "password_hash", nullable = false)
    private String password;
    @Column(unique = true)
    private String phoneNumber;
    @Column(nullable = false)
    private boolean active;

    @Enumerated(EnumType.STRING)
    private UserRole role;


    public User(Long id, String firstname, String lastname, Date birthdate, String documentId, String username, String email, String password, String phoneNumber, boolean active, UserRole role) {
        super(id, firstname, lastname, birthdate, documentId);
        this.username = username;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.active = active;
        this.role = role;
    }

    public User() {

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
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




}
