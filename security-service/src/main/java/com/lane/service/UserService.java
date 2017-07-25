package com.lane.service;

import com.lane.entity.Role;
import com.lane.entity.SystemUser;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    SystemUser findByUserName(String userName);

    List<Role> getPermissions(String username);

    User getCurrentUser();

    Boolean isCurrentUserLoggedIn();

}
