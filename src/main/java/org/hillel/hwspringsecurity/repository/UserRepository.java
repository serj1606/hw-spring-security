package org.hillel.hwspringsecurity.repository;

import org.hillel.hwspringsecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

  @Query("""
            SELECT u FROM User u WHERE u.username = :username
            """)
  Optional<User> findUsersByUsername(@Param("username") String username);
}
