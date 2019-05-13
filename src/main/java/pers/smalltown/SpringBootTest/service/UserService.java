package pers.smalltown.SpringBootTest.service;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import pers.smalltown.SpringBootTest.model.User;

public interface UserService extends JpaRepository<User, BigDecimal>{
	
}
