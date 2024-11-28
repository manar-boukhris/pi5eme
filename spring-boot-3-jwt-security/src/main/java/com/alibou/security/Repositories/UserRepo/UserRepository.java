package com.alibou.security.Repositories.UserRepo;

import java.util.Optional;

import com.alibou.security.Entities.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

  Optional<User> findByEmail(String email);

}
