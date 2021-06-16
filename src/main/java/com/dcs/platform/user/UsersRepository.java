package com.dcs.platform.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UsersRepository extends JpaRepository<Users,Long> {

    // Request : Select u from users u where u.email = ?1
    @Query
    Optional<Users> findUsersByEmail(String email);

}
