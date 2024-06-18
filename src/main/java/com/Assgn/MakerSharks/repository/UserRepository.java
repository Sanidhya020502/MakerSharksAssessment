package com.Assgn.MakerSharks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Assgn.MakerSharks.entity.User;
import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUsername(String username);
}
