package com.heaven.hellospringboot.repositories;

import com.heaven.hellospringboot.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
        }
