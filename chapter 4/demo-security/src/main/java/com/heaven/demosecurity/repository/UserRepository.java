package com.heaven.demosecurity.repository;

import com.heaven.demosecurity.entity.UserAccount;
import org.springframework.data.repository.Repository;

public interface UserRepository extends Repository<UserAccount,Long> {
    UserAccount findByUsername(String username);
}
