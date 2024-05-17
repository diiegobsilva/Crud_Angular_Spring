package com.diegoBatista.course.repositories;

import com.diegoBatista.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
