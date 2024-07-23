package com.buongermino.parking_API.repositories;

import com.buongermino.parking_API.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}