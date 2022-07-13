package com.posco.budget_spring.repository;

import com.posco.budget_spring.model.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDto, Integer> {
    UserDto findByUseridAndPassword(String userid, String password);
}
