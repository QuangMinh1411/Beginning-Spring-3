package com.heaven.demosecurity.repository;

import com.heaven.demosecurity.entity.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserManagementRepository extends JpaRepository<UserAccount,Long> {
}
