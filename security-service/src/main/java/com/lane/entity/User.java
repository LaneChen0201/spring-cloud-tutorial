package com.lane.entity;


import javax.persistence.*;

@Entity
@Table(name = "SYSTEM_USERS")
public class User {
    @Id
    private String userId;

    @Enumerated(EnumType.STRING)
    private Role role;

    private String password;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
