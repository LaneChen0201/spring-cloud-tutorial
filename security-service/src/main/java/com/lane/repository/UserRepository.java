package com.lane.repository;

import com.lane.entity.SystemUser;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<SystemUser, Long> {
    SystemUser findByUserName(String userName);
}
