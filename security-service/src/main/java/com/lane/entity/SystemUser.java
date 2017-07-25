package com.lane.entity;


import javax.persistence.*;

@Entity
@Table(name = "LOGIN_USER")
public class SystemUser {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "USERID")
    private int userId;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Column(name = "USERNAME")
    private String userName;

    private String password;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
