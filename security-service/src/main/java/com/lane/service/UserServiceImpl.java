package com.lane.service;

import com.lane.entity.Role;
import com.lane.entity.SystemUser;
import com.lane.repository.UserRepository;
import com.lane.security.LoggedInChecker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private LoggedInChecker loggedInChecker;

    @Override
    public SystemUser findByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }

    @Override
    public List<Role> getPermissions(String username) {
        List<Role> permissions = new ArrayList<Role>();
        SystemUser user = this.findByUserName(username);
        if(user != null) {
            permissions.add(user.getRole());
        }
        return permissions;
    }

    @Override
    public User getCurrentUser() {
        return loggedInChecker.getLoggedInUser();
    }

    @Override
    public Boolean isCurrentUserLoggedIn() {
        return null;
    }
}
